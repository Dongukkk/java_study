package study.practice.practice41;

public class Sink {
	int width, height, depth;
	String color;
	String texture;
	
	Sink(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public int getWidth() {	//기본 getter
		return width;		//그 상태 그대로 mm 단위
	}
	
	public int getWidthAsCm() {	//width cm 단위로 반환하는 메소드(getter)
		return width/10;
	}
	
	public double getWidthAsMeter() {	//width m 단위로 리턴
		return width/1000.0;
	}
}
