package com.covid19logger.dto;

import java.time.LocalDate;

public class SymDetails {
	private SymptomsDto sym;
	private DetailsDto user;
	private LocalDate date;
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public SymptomsDto getSym() {
		return sym;
	}
	public void setSym(SymptomsDto sym) {
		this.sym = sym;
	}
	public DetailsDto getUser() {
		return user;
	}
	public void setUser(DetailsDto user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "SymDetails [sym=" + sym + ", user=" + user + ", date=" + date + "]";
	}

	

}
