package com.gov;

public class PrimeMinister {
	public  String name="NaMo";
	 
	private static  PrimeMinister pm=new PrimeMinister();
	
	private PrimeMinister()
	{
		
	}
	
	public static PrimeMinister getPm() {
		return pm;
	}
}
 
/* Spring : 
	Spring is a light weight,open source Network,Dependency Injection based framework which is used to develop
	java based applications.
	
	Inversion of Control:
	Spring is used to create the object.
	Dependency Injection:
	1.Constructs Injection
	2.Setter Injection
	Spring forms
	Spring ORM
	Spring MVC
	
	SpringBoot - BE
	-> CRUD
	
	
	JSON
	JWT.
	
*/