package com.covid19logger.Dao;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.covid19logger.model.UserSymptoms;

public interface SymptomsDao extends JpaRepository<UserSymptoms, Long> {

	Optional<UserSymptoms> findByUserID(long userID);

	UserSymptoms findByDateAndUserID(LocalDate date2, long userID);
}
