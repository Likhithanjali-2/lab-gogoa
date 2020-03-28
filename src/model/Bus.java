package model;

import java.time.LocalDate;

public class Bus{
	private int noOfPersons;
	private String busType;
	private int rates;
	private LocalDate date;
	public Bus(int noOfPersons, int rates, String busType, LocalDate date){
		this.noOfPersons = noOfPersons;
		this.busType = busType;
		this.rates = rates;
		this.date = date;
	}
	public void setNoOfPersons(int noOfPersons){
		this.noOfPersons = noOfPersons;
	}
	public void setRates(int rates){
		this.rates = rates;
	}
	public void setBusType(String busType){
		this.busType = busType;
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
	public String getBusType(){
		return this.busType;
	}	
}

// Type your code
