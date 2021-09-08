package prob02;

import java.util.Scanner;

class Goods {

	private String name;
	private int price;
	private int countStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

}

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {

		Goods[] goods = new Goods[COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {
			goods[i] = new Goods();
		}

		goodsInput(goods);// 상품 입력
		goodsPrint(goods);// 상품 출력

	}

	public static void goodsInput(Goods[] goods) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str;

		System.out.println("실행결과");
		
		for (int i = 0; i < COUNT_GOODS; i++) {
			
			str = scanner.nextLine();
			String[] tokens = str.split(" ");
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 잘못된 입력");
				i--;
				continue;
			}
			
			goods[i].setName(tokens[0]);
			goods[i].setPrice(Integer.parseInt(tokens[1]));
			goods[i].setCountStock(Integer.parseInt(tokens[2]));

		}
		
		scanner.close();

	}

	public static void goodsPrint(Goods[] goods) {
		for (int i = 0; i < COUNT_GOODS; i++) {
			System.out.println(goods[i].getName() + " " + goods[i].getPrice() + " " + goods[i].getCountStock());
		}

		for (int i = 0; i < COUNT_GOODS; i++) {
			System.out.println(goods[i].getName() + "(가격:" + goods[i].getPrice() + "원)이 " + goods[i].getCountStock()
					+ "개 입고 되었습니다.");
		}

	}

}
