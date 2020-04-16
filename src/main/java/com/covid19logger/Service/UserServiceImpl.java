package com.covid19logger.Service;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.covid19logger.Dao.SymptomsDao;
import com.covid19logger.Dao.UserDao;
import com.covid19logger.model.UserDetails;
import com.covid19logger.model.UserSymptoms;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	@Autowired
	private SymptomsDao symDao;
	

	@Override
	public UserDetails save(UserDetails user) {
		return dao.save(user);
	}

	@Override
	public UserSymptoms save(UserSymptoms sym) {
		return symDao.save(sym);
	}


	@Override
	public Optional<UserDetails> findById(long id) {
		return dao.findById(id);
	}


	@Override
	public boolean find(long userID) {
		return dao.existsById(userID);
	}

	@Override
	public Optional<UserSymptoms> SfindById(long userID) {
		return symDao.findByUserID(userID);
		}


	@Override
	public UserSymptoms findbyUseridAndDate(long userID, LocalDate date2) {
		return symDao.findByDateAndUserID(date2,userID);
		
	}

}
