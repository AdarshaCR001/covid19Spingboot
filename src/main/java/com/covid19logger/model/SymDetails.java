package com.covid19logger.model;

import java.time.LocalDate;

public class SymDetails {
	private UserSymptoms sym;
	private UserDetails user;
	private LocalDate date;
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public UserSymptoms getSym() {
		return sym;
	}
	public void setSym(UserSymptoms sym) {
		this.sym = sym;
	}
	public UserDetails getuser() {
		return user;
	}
	public void setuser(UserDetails user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "SymDetails [sym=" + sym + ", user=" + user + ", date=" + date + "]";
	}

	

}
