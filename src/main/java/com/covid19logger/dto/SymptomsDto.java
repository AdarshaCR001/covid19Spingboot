package com.covid19logger.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder
public class SymptomsDto {
	@JsonProperty("Runny_Nose")
	private int runnyNose;
	@JsonProperty("Breathing_Diffculty")
	private int breathingDiffculty;
	@JsonProperty("Dry_Cough")
	private int dryCough;
	@JsonProperty("Tiredness")
	private int tiredness;
	@JsonProperty("Sore_throat")
	private int soreThroat;
	@JsonProperty("Body_ache")
	private int bodyAche;
	@JsonProperty("Fever")
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
	
	
	
	
}
