package com.covid19logger.Dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.covid19logger.model.UserDetails;



public interface UserDao extends JpaRepository<UserDetails,Long>{



	
	/* public String userDao(UserDetails userDetails); */
}
