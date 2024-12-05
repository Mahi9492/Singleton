package com.tap.main;

import com.tap.impl.IndianAirForce;
import com.tap.impl.IndianArmy;
import com.tap.impl.IndianNavy;

public class Launch {
	public static void main(String[] args) {
		IndianArmy ia=new IndianArmy();
		IndianNavy in=new IndianNavy();
		IndianAirForce iaf=new IndianAirForce();
		
		ia.addressPM();
		in.addressPM();
		iaf.addressPM();		
	}
}
