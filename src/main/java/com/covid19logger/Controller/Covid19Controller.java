package com.covid19logger.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.covid19logger.Manager.Manager;

import com.covid19logger.model.SymDetails;
import com.covid19logger.model.UserDetails;
import com.covid19logger.model.UserSymptoms;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Covid19Controller {

	@Autowired
	private Manager manager;

	private List<UserSymptoms> details;
	
	@GetMapping("/")
	public String index() {

	    return "This is done by Navneeth alone";
	}


	@PostMapping("/usersymptoms")
	public ResponseEntity<List<UserSymptoms>> userSymptoms(@RequestBody SymDetails symdetails) {
		System.out.println(symdetails.getDate());

			return ResponseEntity.ok(manager.save(symdetails));


	}

	@PostMapping("/getsymptoms")
	public ResponseEntity<List<UserSymptoms>> getHistory(@RequestBody UserDetails users) {
		details=manager.get(users);
		if(details==null) {
			return ResponseEntity.noContent().build();
		}
		else {
			return ResponseEntity.ok(manager.get(users));
		}
		

	}

}
