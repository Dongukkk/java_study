package study.inherit.inherit01;

public class InheritMain {

	public static void main(String[] args) {

		
		//Parent p1 = new Parent();
		Parent p1 = new Parent(1000);
		p1.say();
		p1.money = 1000;
		
		
		Child c1 = new Child();
		c1.money = 2000;
		c1.say();
		
		Child c2 = new Child(5000);
		c2.play();
		
		Child c3 = new Child(3000,4,"대흥초등학교");
		c3.say();
		c3.play();
		c3.printInfo();
		
		c3.donate();
		
		//c3.nightMeal();
	}

}
