package com.covid19logger.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
public class DetailsDto {
	@JsonProperty
	private String isLoggedin;
	@JsonProperty
	private long userID;
	@JsonProperty
	private String name;
	@JsonProperty
	private String email;

	public String getIsLoggedin() {
		return isLoggedin;
	}
	
	public void setIsLoggedin(String isLoggedin) {
		this.isLoggedin = isLoggedin;
	}
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
