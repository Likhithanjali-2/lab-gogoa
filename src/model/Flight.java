package model;

import java.time.LocalDate;

public class Flight{
	private int noOfPersons;
	private String classType;
	private int rates;
	private LocalDate from;
	private LocalDate to;
	private String triptype;
	public Flight(int noOfPersons, int rates, String classType, LocalDate from,LocalDate to,String triptype) {
		this.noOfPersons = noOfPersons;
		this.classType = classType;
		this.rates = rates;
		this.from = from;
		this.to = to;
		this.triptype =triptype;
	}
	public void setNoOfPersons(int noOfPersons){
		this.noOfPersons = noOfPersons;
	}
	public void setRates(int rates){
		this.rates = rates;
	}
	public void setClassType(String classType){
		this.classType = classType;
	}
	public void setFrom(LocalDate from){
		this.from = from;
	}
	public void setTo(LocalDate to){
		this.to = to;
	}
	
	public int getNoOfPersons(){
		return this.noOfPersons;
	}
	public int getRates(){
		return this.rates;
	}
	public String getClassType(){
		return this.classType;
	}
	public LocalDate getTo(){
		return this.to;
	}
	public LocalDate getFrom(){
		return this.from;
	}
	
}
//Type your code 