package com.covid19logger.Service;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.covid19logger.model.UserDetails;
import com.covid19logger.model.UserSymptoms;


@Service
public interface UserService {
	
	public UserDetails save(UserDetails user);
	public UserSymptoms save(UserSymptoms sym);
	public Optional<UserDetails> findById(long id);
	public boolean find(long userID);
	public Optional<UserSymptoms> SfindById(long userID);
	public UserSymptoms findbyUseridAndDate(long userID, LocalDate date2);
	



}
