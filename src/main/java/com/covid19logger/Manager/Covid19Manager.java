package com.covid19logger.Manager;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.covid19logger.Service.UserService;
import com.covid19logger.model.SymDetails;
import com.covid19logger.model.UserDetails;
import com.covid19logger.model.UserSymptoms;

@Component
public class Covid19Manager implements Manager {
	
	@Autowired
	private UserService users;
	private UserSymptoms usersym;
	private UserDetails userdetails;
	private Optional<UserDetails> valid;
	private UserSymptoms today;
	private LocalDate date2;

	
	@Override
	public UserSymptoms save(SymDetails symdetails) {
		
		date2=symdetails.getDate();
		userdetails=symdetails.getuser();
		usersym=symdetails.getSym();
		today=users.findbyUseridAndDate(userdetails.getUserID(),date2);

		if (users.find(userdetails.getUserID())==false){
			System.out.println("new user");
			users.save(userdetails);
			usersym.setUserID(userdetails.getUserID());
			usersym.setDate(date2);
			return users.save(usersym);
		}else if(today!=null) {
			System.out.println("submitting same day so updating");
			usersym.setId(today.getId());
			usersym.setUserID(userdetails.getUserID());
			usersym.setDate(date2);
			return users.save(usersym);
		}else{
			System.out.println("user already exists so inserting symptoms");
			usersym.setUserID(userdetails.getUserID());
			usersym.setDate(date2);
			return users.save(usersym);
		}
		
		
	}


	@Override
	public List<UserSymptoms> get(UserDetails history) {

		if (users.find(history.getUserID())==false){
			return null;
		}else {
			valid=users.findById(history.getUserID());
			return valid.get().getUsersym();
		}
		
	}



}
