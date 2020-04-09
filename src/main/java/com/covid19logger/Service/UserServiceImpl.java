package com.covid19logger.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
		// TODO Auto-generated method stub
		//System.out.println(user);
		dao.save(user);
		return user;
	}


	@Override
	public UserSymptoms save(UserSymptoms sym) {
		System.out.println(sym);
		return symDao.save(sym);
	}


	@Override
	public Optional<UserDetails> findById(long id) {
		
		return dao.findById(id);
	}


	@Override
	public boolean find(long userID) {
		// TODO Auto-generated method stub
		return dao.existsById(userID);
	}


	@Override
	public void update(UserSymptoms usersym,LocalDate date) {
			//System.out.println(symDao.findByDate(date.getDate()));
			System.out.println("userservice "+usersym.getDate());
			System.out.println(symDao.deleteByDateAndUserID(date,usersym.getUserID()));
			symDao.save(usersym);
		
		
	}


	@Override
	public Optional<UserSymptoms> SfindById(long userID) {
		return symDao.findByUserID(userID);
		
	}


	@Override
	public boolean findbyUseridAndDate(long userID, LocalDate date2) {
		if(symDao.findByDateAndUserID(date2,userID)!=null) {
			return true;
		}
		else {
			return false;
		}
		
	}





}
