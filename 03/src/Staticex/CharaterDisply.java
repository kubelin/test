package Staticex;

public class CharaterDisply extends AbstractDisply {

	@Override
	public void open() {
		System.out.print("<<");
		
	}

	@Override
	public void print() {
		System.out.print('a');
		
	}

	@Override
	public void close() {
		System.out.print(">>");
		
	}

}
