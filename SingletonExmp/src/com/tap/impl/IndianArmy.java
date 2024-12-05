package com.tap.impl;

import com.gov.PrimeMinister;
import com.tap.interfaces.Services;

public class IndianArmy implements Services {

	public void addressPM() {
		PrimeMinister pm=PrimeMinister.getPm();
		System.out.println("IndianArmy says: Prime Minister is: "+pm);
	}

}
