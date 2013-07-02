package innerclass;

class Outer{
	private int i=10;
	static int si =2;
	Inner inner3;
	class Inner {
		int j=3;
		int k=0;
		
		void print(){
			
			System.out.println(i);
			System.out.println(si);
			System.out.println(Outer.this.i);
		}
	}
	public Outer(){
		Inner inner1 =new Inner();
		Inner inner2 =this.new Inner();
		inner3 =new Inner();
		
	}
	
}

public class InnerClassTest {
public static void main(String[] args) {
	Outer outer =new Outer();
	outer.inner3.print();
}
}
