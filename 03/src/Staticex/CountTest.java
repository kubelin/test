package Staticex;
class Count{
	private int serialNumber;
	public static int counter=0;
	static {		
		counter = 0;
	}
	public Count(){
		counter++;
		serialNumber =counter;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public static int getCounter(){
		int i=10;
		return counter;
	}
}
public class CountTest {

	public static void main(String[] args) {
		System.out.println(Count.counter);
		System.out.println(Count.getCounter());
		Count c =new Count();
		System.out.println(c.getSerialNumber());
		
	}
}
