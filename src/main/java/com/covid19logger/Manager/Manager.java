package com.covid19logger.Manager;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.covid19logger.model.SymDetails;
import com.covid19logger.model.UserDetails;
import com.covid19logger.model.UserSymptoms;

public interface Manager {

	List<UserSymptoms> save(SymDetails symdetails);

	List<UserSymptoms> get(UserDetails users);
	
	

}
