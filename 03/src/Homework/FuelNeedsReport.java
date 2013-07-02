package Homework;

import java.io.PrintStream;
import java.util.ArrayList;

public class FuelNeedsReport {
	ArrayList<Vehicle> v =Company.getVehicle();
	Vehicle v2;
	double total_fuel =0.0;
	public void getnerateText(PrintStream out) {
		for(int i=0;i<v.size();i++)
		{
			v2=v.get(i);
			total_fuel += v2.calcFuelNeeds();
			
			
					
			
		}
		out.print(total_fuel);
	}
}
