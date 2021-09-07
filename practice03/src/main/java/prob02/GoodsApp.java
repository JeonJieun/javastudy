package prob02;

import java.util.Scanner;

class Goods {

	private String name;
	private int price;
	private int countStock;

	Goods() {
		name = new String();
		price = 0;
		countStock = 0;
	}

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
		
		goodsInput(goods);//상품 입력
		goodsPrint(goods);// 상품 출력
		
	}

	public static void goodsInput(Goods[] goods) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int price;
		int countStock;

		System.out.println("실행결과 : ");
		
		for (int i = 0; i < COUNT_GOODS; i++) {

			System.out.print("상품명 : ");
			name = scanner.nextLine();
			
			goods[i].setName(name);

			scanner.nextLine(); // 버퍼비우기

			System.out.println();

			System.out.print("가격 : ");
			price = scanner.nextInt();
			goods[i].setPrice(price);

			System.out.println();

			System.out.print("입고 수 : ");
			countStock = scanner.nextInt();
			goods[i].setCountStock(countStock);

			System.out.println();

		}
		
		scanner.close();

	}
	
	public static void goodsPrint(Goods[] goods) {
		for (int i = 0; i < COUNT_GOODS; i++) {
			System.out.println(goods[i].getName()+" "+goods[i].getPrice()+" "+goods[i].getCountStock());
		}
		
		for (int i = 0; i < COUNT_GOODS; i++) {
			System.out.println(goods[i].getName()+"(가격:"+goods[i].getPrice()+"원)이 "+goods[i].getCountStock()+"개 입고 되었습니다.");
		}
		
	}

}
