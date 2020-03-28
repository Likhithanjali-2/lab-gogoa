package services;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;
import java.time.Period;
public class FareCalculator extends Booking{
	int days,months;
	public double book(Hotel hotel) {
		 double totalFare = 0;
		 Period diff=Period.between(hotel.getFromdate(), hotel.getTodate());
		 months=diff.getMonths();
		 days=diff.getDays();
		 totalFare = (hotel.getNoOfPersons()*hotel.getRates())+(months*30)+days;
		return totalFare;
	}
	public double book(Flight flight) {
		double totalFare = 0;
		Period diff=Period.between(flight.getFrom(), flight.getTo());
		 months=diff.getMonths();
		 days=diff.getDays();
		 totalFare = (flight.getNoOfPersons()*flight.getRates())+(months*30)+days;
		return totalFare;
	}
	public double book(Train train) {
		double totalFare = 0;
		totalFare = train.getNoOfPersons()*train.getRates();
		return totalFare;
	}
	public double book(Bus bus) {
		double totalFare = 0;
		totalFare = bus.getNoOfPersons()*bus.getRates();
		return totalFare;
	}
}
// Type your code