package com.covid19logger.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserDetails {

	@Column(name="isloggedin")
	private String isLoggedin;

	@Id
	@Column(name="userid", unique = true, nullable = false)
	private long userID;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="userid",referencedColumnName = "userid")
	private List<UserSymptoms> usersym;
	

	
	@Column(name="name")
	private String name;

	@Column(name="email")
	private String email;

	
	public List<UserSymptoms> getUsersym() {
		return usersym;
	}
	public void setUsersym(List<UserSymptoms> usersym) {
		this.usersym = usersym;
	}
	
	
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
	

	@Override
	public String toString() {
		return "UserDetails [isLoggedin=" + isLoggedin + ", userID=" + userID + ", name=" + name + ", email=" + email+ "]";
	}
	
	
	
	}
