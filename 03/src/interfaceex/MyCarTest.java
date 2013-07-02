package interfaceex;

interface IFork{
	public abstract void dig();

}
interface ITank{
	void shoot();
}
abstract class AutoCar{
	public abstract void drive();

}
class MyCar extends AutoCar implements IFork,ITank{

	@Override
	public void shoot() {
		System.out.println("shoot");

	}

	@Override
	public void dig() {
		System.out.println("dig");

	}

	@Override
	public void drive() {
		System.out.println("drive");

	}
	public void soundHorn(){
		System.out.println("soundHorn");
	}
}

public class MyCarTest {
	public static void main(String[] args) {
		MyCar m =new MyCar();

		m.dig();
		m.drive();
		m.shoot();
		m.soundHorn();

		IFork f =m;
		f.dig();

		ITank t = m;
		t.shoot();

		AutoCar a =m;
		m.dig();

	}
}
