package model;

import java.time.LocalDate;

public class Train{
	private int noOfPersons;
	private String berth;
	private int rates;
	private LocalDate date;
	public Train(int noOfPersons, int rates, String berth, LocalDate date){
		this.noOfPersons = noOfPersons;
		this.berth = berth;
		this.rates = rates;
		this.date = date;
	}
	public void setNoOfPersons(int noOfPersons){
		this.noOfPersons = noOfPersons;
	}
	public void setRates(int rates){
		this.rates = rates;
	}
	public void setBerth(String berth){
		this.berth = berth;
	}
	public void setDate(LocalDate date){
		this.date = date;
	}
	
	public int getNoOfPersons(){
		return this.noOfPersons;
	}
	public int getRates(){
		return this.rates;
	}
	public String getBerth(){
		return this.berth;
	}
	
	
}

// Type your code