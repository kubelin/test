package interfaceex;
//class MyCar extends AutoCar implements IFork,ITank
public class VideoShop extends Shop implements IQueue {

	@Override
	public void enQueue(String name) {
		store.add(name);

		System.out.println(name+"is "+"�ݳ�");

	}

	@Override
	public String deQueue() {
		String name = store.remove(0);
		System.out.println(name+"is "+"�뿩");
		return null;
	}


}
