package com.covid19logger.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.covid19logger.model.SymDetails;
import com.covid19logger.model.UserDetails;
import com.covid19logger.model.UserSymptoms;


@Service
public interface UserService {
	
	public UserDetails save(UserDetails user);
	public UserSymptoms save(UserSymptoms sym);
	public Optional<UserDetails> findById(long id);
	public boolean find(long userID);
	
	public void update(UserSymptoms usersym, LocalDate date2);
	public Optional<UserSymptoms> SfindById(long userID);
	public boolean findbyUseridAndDate(long userID, LocalDate date2);
	



}
