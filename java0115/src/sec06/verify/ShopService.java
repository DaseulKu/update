package sec06.verify;

public class ShopService {
	private static ShopService shopServise = new ShopService();
	private ShopService() {}
	public static ShopService getInstance() {
		return shopServise;
	}
}
