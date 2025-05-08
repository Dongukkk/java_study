package study.inherit.inherit02;

import study.inherit.inherit01.Parent;

public class HideChild extends Parent {

	public HideChild() {
		super(0);
	}
	
	public void printInfo() {
		System.out.println(money);
	}
}
