package com.springinaction.springidol;

public class Auditorium implements TurnOnOrOff{
	
	public Auditorium(){};
	
	public void turnOnLights(){
		System.out.println("turn on lights before the perform.");
	}
	
	public void turnOffLights(){
		System.out.println("turn off lights after the perform");
	}
}
