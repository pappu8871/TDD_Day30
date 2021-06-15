package com.invoiceGenerator;

public class InvoiceGenerator {

	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KILOMETER = 10;
	private static final double MINIMUM_FARE = 5;

	public static  double calculateFare(double distance, int time) {
		double totalFare= distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		if(totalFare < MINIMUM_FARE)
		return MINIMUM_FARE;
		return totalFare;
	}

	public static double calculateFare(Ride[] rides) {
		// TODO Auto-generated method stub
		double  totalFare = 0;
		for (Ride ride:rides) {
		totalFare += calculateFare(ride.distance, ride.time);
		}
		return totalFare;
	}
}
