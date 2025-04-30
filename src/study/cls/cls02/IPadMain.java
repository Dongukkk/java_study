package study.cls.cls02;

import java.util.Scanner;

public class IPadMain {

	public static void main(String[] args) {
		IPad pad1 = new IPad();
		pad1.owner = "오이영";
		
		pad1.powerOn();
		
		IPad pad2 = new IPad();
		pad2.owner = "구도원";
		
		pad2.powerOn();
		
		Scanner scanner = new Scanner(System.in);
		
		String ss = "123";
		
		int ii = Integer.parseInt(ss);
		
		int num = (int)(Math.random()*6)+1;//1~6

		System.out.println(Math.PI);
		
		IPad.check();
		
		//pad2.check();	->	IPad.check();
		
		System.out.println(IPad.brand);
		//System.out.println(pad1.brand);
	}

}
