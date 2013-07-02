package Homework;

import java.util.ArrayList;



public  class Company {
	private static Company instance =new Company();
	private static ArrayList<Vehicle> list =new ArrayList<Vehicle>();
	private Company(){}
	public static Company getInstance(){
		if (instance ==null)
			instance= new Company();
			String dd = new String("sdfsdf");
		return instance;

	}

	public void addVehicle(Vehicle v){
		list.add(v);
	}
	public static ArrayList<Vehicle> getVehicle()
	{
		return list;
	}
	public Vehicle getVchiclelist(int i){
		return list.get(i);
		
	}
}
