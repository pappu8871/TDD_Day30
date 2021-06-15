package com.invoiceGenerator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class InvoiceGeneratorTest {

//	@Test
//	 public void givenDistanceAndTime_ShouldReturnTotalFare() {
//		InvoiceGenerator invoiceGenerator =new InvoiceGenerator();
//		double distance = 2.0;
//        int time = 5;
//        double fare = invoiceGenerator.calculateFare(distance, time);
//        Assert.assertEquals(25, fare, 0.0);
//	}
	
	@Test
	 public void givenDistanceAndTime_ShouldReturnMinFare() {
		InvoiceGenerator2 invoiceGenerator =new InvoiceGenerator2();
		double distance = 0.1;
      int time = 1;
      double totalfare = invoiceGenerator.calculateMINFare(distance, time);
     Assert.assertEquals(5.0, totalfare, 0.0);
	}
}
