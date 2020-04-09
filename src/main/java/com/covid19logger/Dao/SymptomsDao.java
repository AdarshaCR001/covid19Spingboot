package com.covid19logger.Dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.covid19logger.model.UserSymptoms;

public interface SymptomsDao extends JpaRepository<UserSymptoms, Long> {

	List<UserSymptoms> findAllByDate(Date date);

	/*
	 * @Query("select s from symptoms s where s.date like '%:date'") Date
	 * findByDate(int date);
	 * 
	 * @Modifying
	 * 
	 * @Query("UPDATE symptoms s SET s.") int updateDate(Date date);
	 */



	int deleteByDate(Date date);
	@Transactional
	@Modifying
	int deleteByDateAndUserID(LocalDate date,Long userId);
	
	@Transactional
	UserSymptoms findAllByDateAndUserID(Date date, long userID);

	Optional<UserSymptoms> findByUserID(long userID);

	UserSymptoms findByDateAndUserID(LocalDate date2, long userID);
}
