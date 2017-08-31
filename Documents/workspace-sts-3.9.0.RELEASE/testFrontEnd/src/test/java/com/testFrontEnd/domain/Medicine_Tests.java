package com.testFrontEnd.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

import org.junit.Assert;

import junit.framework.TestCase;

public class Medicine_Tests extends TestCase {
	private Medicine medicine;
	
	protected void setUp() throws Exception {
		medicine = new Medicine();
	}
	
	public void testSetAndGetExpiration_date() {
		Date testExpiration_date = Date.valueOf(LocalDate.now());
		Assert.assertNull(this.medicine.getExpirationDate());
		medicine.setExperationDate(testExpiration_date);
		assertEquals(testExpiration_date, this.medicine.getExpirationDate());
	}
	
	public void testSetAndGetName() {
		String testName = "Wenceslao";
		assertNull(this.medicine.getName());
		medicine.setName(testName);
		assertEquals(testName, this.medicine.getName());
	}
	
	public void testSetAndGetWeight() {
		double testWeight = 43.21;
		assertNull(this.medicine.getWeight());
		medicine.setWeight(testWeight);
		assertEquals(testWeight, this.medicine.getWeight());
	}
	
	public void testSetAndGetStock_Elements() {
		stock_Element testStock_Element = new stock_Element();
		assertNull(testStock_Element);
		testStock_Element.setId(Long.MIN_VALUE);
		testStock_Element.setPrice(BigDecimal.valueOf(23.56));
		testStock_Element.setCost(BigDecimal.valueOf(23.56));
	}


	
}
