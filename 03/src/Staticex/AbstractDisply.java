package Staticex;

public abstract class AbstractDisply {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	public final void diaply(){
		open();
		for(int i=0;i<5;i++)
			print();
		close();
		
	} 
}
