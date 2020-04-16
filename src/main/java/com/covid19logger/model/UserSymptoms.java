package com.covid19logger.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

	@Column(name = "runny_nose")
	private int runnyNose;


	@Column(name = "breathing_diffculty")
	private int breathingDiffculty;

	@Column(name = "dry_cough")
	private int dryCough;

	@Column(name = "tiredness")
	private int tiredness;

	@Column(name = "sore_throat")
	private int soreThroat;

	@Column(name = "body_ache")
	private int bodyAche;

	@Column(name = "fever")
	private int fever;


	
	

	public int getRunnyNose() {
		return runnyNose;
	}

	public void setRunnyNose(int runnyNose) {
		this.runnyNose = runnyNose;
	}

	public int getBreathingDiffculty() {
		return breathingDiffculty;
	}

	public void setBreathingDiffculty(int breathingDiffculty) {
		this.breathingDiffculty = breathingDiffculty;
	}

	public int getDryCough() {
		return dryCough;
	}

	public void setDryCough(int dryCough) {
		this.dryCough = dryCough;
	}

	public int getTiredness() {
		return tiredness;
	}

	public void setTiredness(int tiredness) {
		this.tiredness = tiredness;
	}

	public int getSoreThroat() {
		return soreThroat;
	}

	public void setSoreThroat(int soreThroat) {
		this.soreThroat = soreThroat;
	}

	public int getBodyAche() {
		return bodyAche;
	}

	public void setBodyAche(int bodyAche) {
		this.bodyAche = bodyAche;
	}

	public int getFever() {
		return fever;
	}

	public void setFever(int fever) {
		this.fever = fever;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserSymptoms [id=" + id + ", userID=" + userID + ", date=" + date + ", runnyNose=" + runnyNose
				+ ", breathingDiffculty=" + breathingDiffculty + ", dryCough=" + dryCough + ", tiredness=" + tiredness
				+ ", soreThroat=" + soreThroat + ", bodyAche=" + bodyAche + ", fever=" + fever + "]";
	}
	
		

}