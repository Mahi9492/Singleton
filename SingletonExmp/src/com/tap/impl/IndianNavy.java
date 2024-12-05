package com.tap.impl;

import com.gov.PrimeMinister;
import com.tap.interfaces.Services;

public class IndianNavy implements Services {

	public void addressPM() {
		PrimeMinister pm=PrimeMinister.getPm();
		System.out.println("IndianNavy says: Prime Minister is: "+pm);
		
	}
}
 