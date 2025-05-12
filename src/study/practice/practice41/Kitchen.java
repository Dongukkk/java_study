package study.practice.practice41;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {

	int[] size = new int[2];
	String wallColor = "";
	int height;
	
	Refrigerator refrigerator = new Refrigerator();
	Stove stove = new Stove(4);
	Sink sink = new Sink(80, 30, 30);
	List<TrashCan> trashcanList = new ArrayList<TrashCan>();
	List<Cup> cupList = new ArrayList<Cup>();
	
	
	
	Kitchen(int x, int y){
		size[0]=x;
		size[1]=y;
	}

}
