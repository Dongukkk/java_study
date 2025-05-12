package study.practice.practice41;

public class TrashCan {
	int volume;
	int color;
	boolean open;
	double volumeRate;
	
	
	void open() {
		open = true;
	}
	
	void close() {
		open = false;
	}
	
	void trash(int trash) {
		volumeRate += (trash/(double)volume);
	}
	
	void empty() {
		volumeRate=0;
	}

}
