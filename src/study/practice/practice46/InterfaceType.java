package study.practice.practice46;

import java.util.ArrayList;
import java.util.List;

//basecode
public class InterfaceType {
	public static void main(String[] args) {
//객체 생성
		List<Orderable> order = new ArrayList<Orderable>();
		order.add(new Food("족발",19800));
		order.add(new Electronics("에어팟",199000));
		order.add(new Clothing("셔츠",49900));
//총합 계산
		int total=0;
		for(Orderable o : order) {
			total +=o.discountedPrice();
		}
//결과 출력
		System.out.println("총합: " + total + "원");
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		return price/10*9;
	}
}

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		return price/10*8;
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		return price/10*7;
	}
}
