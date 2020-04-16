package com.covid19logger.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import com.covid19logger.model.UserDetails;

public interface UserDao extends JpaRepository<UserDetails,Long>{

}
