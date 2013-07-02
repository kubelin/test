package Homework;

public abstract class Vehicle {
	public abstract double calcFuelEfficiency();
	//연비
	public abstract double calcTripDistance();
	//거리
	
	public final double calcFuelNeeds(){
		return calcTripDistance()/calcFuelEfficiency();
	}
	

}
