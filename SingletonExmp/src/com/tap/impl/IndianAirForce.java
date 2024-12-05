package com.tap.impl;

import com.gov.PrimeMinister;
import com.tap.interfaces.Services;

public class IndianAirForce implements Services {

	public void addressPM() {
		PrimeMinister pm=PrimeMinister.getPm();
		System.out.println("IndianAirForce says: Prime Minister is: "+pm );
	}

}
