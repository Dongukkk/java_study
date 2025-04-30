package study.practice.practice29;

public class Triangle {
	int base;
	int height;
	
	void setSize(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	double getArea() {
		return base * height * 0.5;
	}
}
