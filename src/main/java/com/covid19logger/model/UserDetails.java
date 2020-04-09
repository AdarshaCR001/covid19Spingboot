package com.covid19logger.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@Entity
@Table(name="user")
public class UserDetails {
	@JsonProperty
	@Column(name="isloggedin")
	private String isLoggedin;
	@JsonProperty
	@Id
	@Column(name="userid", unique = true, nullable = false)
	private long userID;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="userid",referencedColumnName = "userid")
	private List<UserSymptoms> usersym;
	

	@JsonProperty
	@Column(name="name")
	private String name;
	@JsonProperty
	@Column(name="email")
	private String email;
	@JsonProperty
	@Column(name="picture")
	private String picture;
	
	
	public List<UserSymptoms> getUsersym() {
		return usersym;
	}
	public void setUsersym(List<UserSymptoms> usersym) {
		this.usersym = usersym;
	}
	
	@JsonProperty
	public String getIsLoggedin() {
		return isLoggedin;
	}
	@JsonProperty
	public void setIsLoggedin(String isLoggedin) {
		this.isLoggedin = isLoggedin;
	}
	@JsonProperty
	public long getUserID() {
		return userID;
	}
	@JsonProperty
	public void setUserID(long userID) {
		this.userID = userID;
	}
	@JsonProperty
	public String getName() {
		return name;
	}
	@JsonProperty
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty
	public String getEmail() {
		return email;
	}
	@JsonProperty
	public void setEmail(String email) {
		this.email = email;
	}
	@JsonProperty
	public String getPicture() {
		return picture;
	}
	@JsonProperty
	public void setPicture(String picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "UserDetails [isLoggedin=" + isLoggedin + ", userID=" + userID + ", name=" + name + ", email=" + email
				+ ", picture=" + picture + "]";
	}
	
	
	
	}
