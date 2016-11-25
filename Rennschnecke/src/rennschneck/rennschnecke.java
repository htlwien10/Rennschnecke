package rennschneck;

import java.util.Random;

class rennschnecke {
	//Eigenschaften
	private String name;
	private double vMax;
	private double range;
	
	
	//Konstruktoren
	public rennschnecke (String name) {
		this.name = name;
		this.vMax = 10;
		this.range= 0;
	}
	
	
	//Methoden
	public String getName() {
		return name;
	}
	
	public void krieche() {
		Random zufall = new Random();
		range = range + vMax * (zufall.nextInt(100)+1)/100;
	}
	
}
