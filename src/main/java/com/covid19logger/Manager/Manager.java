package com.covid19logger.Manager;


import java.util.List;
import com.covid19logger.model.SymDetails;
import com.covid19logger.model.UserDetails;
import com.covid19logger.model.UserSymptoms;

public interface Manager {

	UserSymptoms save(SymDetails symdetails);

	List<UserSymptoms> get(UserDetails users);
	
	

}
