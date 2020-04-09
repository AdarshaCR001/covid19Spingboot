package com.covid19logger.model;

import java.time.LocalDate;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
@Entity
@Table(name = "symptoms")
public class UserSymptoms {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "userid")
	private long userID;

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}
	@Column(name="date")
	private LocalDate date;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	@JsonProperty
	@Column(name = "runny_nose")
	private int Runny_Nose;

	@JsonProperty
	@Column(name = "breathing_diffculty")
	private int Breathing_Diffculty;
	@JsonProperty
	@Column(name = "dry_cough")
	private int Dry_Cough;
	@JsonProperty
	@Column(name = "tiredness")
	private int Tiredness;
	@JsonProperty
	@Column(name = "sore_throat")
	private int Sore_throat;
	@JsonProperty
	@Column(name = "body_ache")
	private int Body_ache;
	@JsonProperty
	@Column(name = "fever")
	private int Fever;

	/*
	 * public UserDetails getUserdet() { return userdet; } public void
	 * setUserdet(UserDetails userdet) { this.userdet = userdet; }
	 */

	@JsonProperty
	public int getRunny_Nose() {
		return Runny_Nose;
	}

	@JsonProperty
	public void setRunny_Nose(int runny_Nose) {
		Runny_Nose = runny_Nose;
	}

	@JsonProperty
	public int getBreathing_Diffculty() {
		return Breathing_Diffculty;
	}

	@JsonProperty
	public void setBreathing_Diffculty(int breathing_Diffculty) {
		Breathing_Diffculty = breathing_Diffculty;
	}

	@JsonProperty
	public int getDry_Cough() {
		return Dry_Cough;
	}

	@JsonProperty
	public void setDry_Cough(int dry_Cough) {
		Dry_Cough = dry_Cough;
	}

	@JsonProperty
	public int getTiredness() {
		return Tiredness;
	}

	@JsonProperty
	public void setTiredness(int tiredness) {
		Tiredness = tiredness;
	}

	@JsonProperty
	public int getSore_throat() {
		return Sore_throat;
	}

	@JsonProperty
	public void setSore_throat(int sore_throat) {
		Sore_throat = sore_throat;
	}

	@JsonProperty
	public int getBody_ache() {
		return Body_ache;
	}

	@JsonProperty
	public void setBody_ache(int body_ache) {
		Body_ache = body_ache;
	}

	@JsonProperty
	public int getFever() {
		return Fever;
	}

	@JsonProperty
	public void setFever(int fever) {
		Fever = fever;
	}

	@Override
	public String toString() {
		return "UserSymptoms [Runny_Nose=" + Runny_Nose + ", Breathing_Diffculty=" + Breathing_Diffculty
				+ ", Dry_Cough=" + Dry_Cough + ", Tiredness=" + Tiredness + ", Sore_throat=" + Sore_throat
				+ ", Body_ache=" + Body_ache + ", Fever=" + Fever + "]";
	}

}