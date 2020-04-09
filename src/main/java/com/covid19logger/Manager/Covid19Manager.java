package com.covid19logger.Manager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	private LocalDate symvalid;
	private Boolean date;
	private LocalDate date2;
	private int temp;
	
	@Override
	public List<UserSymptoms> save(SymDetails symdetails) {
		
		date2=symdetails.getDate().plusDays(1);
		
		userdetails=symdetails.getuser();
		usersym=symdetails.getSym();
		date=users.findbyUseridAndDate(userdetails.getUserID(),date2);
		//date=users.SfindById(userdetails.getUserID()).get().getDate();
		//System.out.println("symvalid "+symvalid.equals(date2));
		
	
		if (users.find(userdetails.getUserID())==false){
			System.out.println("new user");
			users.save(userdetails);
			usersym.setUserID(userdetails.getUserID());
			usersym.setDate(date2);
			valid=users.findById(userdetails.getUserID());
			users.save(usersym);
			return valid.get().getUsersym();
		}else if(date) {
			System.out.println("submitting same day so updating");
			System.out.println(date);
			usersym.setUserID(userdetails.getUserID());
			usersym.setDate(date2);
			users.update(usersym,date2);
			valid=users.findById(userdetails.getUserID());
			return valid.get().getUsersym();
		}else{
			System.out.println("ggwp"+date2);
			usersym.setUserID(userdetails.getUserID());
			usersym.setDate(date2);
			System.out.println("user already exists so inserting symptoms");

			users.save(usersym);
			valid=users.findById(userdetails.getUserID());
			return valid.get().getUsersym();
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
