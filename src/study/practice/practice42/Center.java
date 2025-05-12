package study.practice.practice42;

import java.util.ArrayList;
import java.util.List;

public class Center {

	public static void main(String[] args) {
		
		List<Staff> staffList = new ArrayList<Staff>();
		
		staffList.add(new Staff("김일",1));
		staffList.add(new Staff("김이",2));
		staffList.add(new Staff("김삼",3));
		staffList.add(new Staff("김사",4));
		
		
		List<Room> roomList = new ArrayList<Room>();
		
		roomList.add(new Office(101));
		roomList.add(new Lounge(102));
		roomList.add(new Classroom(103));
		roomList.add(new Classroom(104));
		
		roomList.add(new Lounge(202));
		roomList.add(new Classroom(203));
		roomList.add(new Classroom(204));
		
		
	}
}
