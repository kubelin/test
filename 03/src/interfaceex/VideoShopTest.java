package interfaceex;

public class VideoShopTest {
	public static void main(String[] args) {
		IQueue vShop = new VideoShop();
		vShop.enQueue("tomas1");
		vShop.enQueue("tomas2");
		vShop.enQueue("tomas3");

		vShop.deQueue();
		vShop.deQueue();
		vShop.deQueue();
	}
}
