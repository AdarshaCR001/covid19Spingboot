package com.covid19logger.manager;


import java.util.List;

import com.covid19logger.dto.DetailsDto;
import com.covid19logger.dto.SymDetails;
import com.covid19logger.model.UserSymptoms;

public interface Manager {

	UserSymptoms save(SymDetails symdetails);

	List<UserSymptoms> get(DetailsDto users);
	
	

}
