package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.setName("Nikon");
		goods.setPrice(2000);
		goods.setCountStock(10);
		goods.setCountSold(20);
		
		int discoutPrice = goods.calcDiscountPrice(50);
		
		System.out.println(discoutPrice);
		
		goods.showInfo();
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
	}

}