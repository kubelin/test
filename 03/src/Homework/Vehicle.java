package Homework;

public abstract class Vehicle {
	public abstract double calcFuelEfficiency();
	//����
	public abstract double calcTripDistance();
	//�Ÿ�
	
	public final double calcFuelNeeds(){
		return calcTripDistance()/calcFuelEfficiency();
	}
	

}
