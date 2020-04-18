package com.covid19logger.manager;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.covid19logger.dto.DetailsDto;
import com.covid19logger.dto.SymDetails;
import com.covid19logger.model.UserDetails;
import com.covid19logger.model.UserSymptoms;
import com.covid19logger.service.UserService;

@Component
public class Covid19Manager implements Manager {
	
	@Autowired
	private UserService users;
	Optional<UserDetails> valid;

	
	@Override
	public UserSymptoms save(SymDetails symdetails) {
		UserSymptoms usersym;
		UserDetails userdetails;
		UserSymptoms today;
		LocalDate date2;
		ModelMapper modelMapper = new ModelMapper();
		
		
		date2=symdetails.getDate();
		userdetails= modelMapper.map(symdetails.getUser(), UserDetails.class);
		usersym=modelMapper.map(symdetails.getSym(), UserSymptoms.class);
		today=users.findbyUseridAndDate(userdetails.getUserID(),date2);

		if (!users.find(userdetails.getUserID())){
			users.save(userdetails);
			usersym.setUserID(userdetails.getUserID());
			usersym.setDate(date2);
			return users.save(usersym);
		}else if(today!=null) {
			usersym.setId(today.getId());
			usersym.setUserID(userdetails.getUserID());
			usersym.setDate(date2);
			return users.save(usersym);
		}else{
			usersym.setUserID(userdetails.getUserID());
			usersym.setDate(date2);
			return users.save(usersym);
		}
		
		
	}


	@Override
	public List<UserSymptoms> get(DetailsDto history) {
		valid=users.findById(history.getUserID());
		if (!valid.isPresent()){
			return  Collections.emptyList();
		}else {
			return valid.get().getUsersym();
		}
		
	}



}
