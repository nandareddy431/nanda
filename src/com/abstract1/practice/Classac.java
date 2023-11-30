package com.abstract1.practice;

public abstract class Classac implements Interface_AC {
	//in this abstract class we implement all methods
public void play() {
		
		System.out.println("Apple cut code");
	}

	
	public void stop() {
		
		System.out.println("Apple copy code");
	}

	
	public abstract void swing();

	
	public abstract void turbo(); //without implementation if we write method in abstract class it will through error
	
	}	


