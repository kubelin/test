package Homework;

public class ShippingMain {
public static void main(String[] args) {
	Company company =Company.getInstance();
	company.addVehicle(new Truck());
	company.addVehicle(new RiverBarge());
	company.addVehicle(new Truck());
	company.addVehicle(new Truck());
	company.addVehicle(new RiverBarge());
	
	FuelNeedsReport report =new FuelNeedsReport();
	report.getnerateText(System.out);
	
}
}
