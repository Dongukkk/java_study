package study.practice.practice44;

public abstract class Unit {
	int x, y; // 현재 위치
	
	public abstract void move(int x, int y); // 지정된 위치로 이동 (추상화)

	public void stop() {
		System.out.println("현재 위치에 정지");
	} // 현재 위치에 정지
	
}

//base code
class Marine extends Unit { // 보병
	//int x, y; // 현재 위치

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.printf("%s %s로 걸어가기\n",x,y);
	} // 지정된 위치로 이동

	void stimPack() {
		System.out.println("스팀팩 사용");
	} // 스팀팩을 사용한다
}

class Tank extends Unit { // 탱크
	//int x, y; // 현재 위치

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.printf("%s %s로 바퀴구르기\n",x,y);
	} // 지정된 위치로 이동

	void changeMode() {
		System.out.println("공격모드 변환");
	} // 공격모드를 변환한다
}

class Dropship extends Unit { // 수송선
	//int x, y; // 현재 위치

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.printf("%s %s로 날기\n",x,y);
	} // 지정된 위치로 이동

	void load(Unit unit) {
		System.out.printf("%s 태우기\n","유닛");
	} // 선택된 대상을 태운다

	void unload(Unit unit) {
		System.out.printf("%s 내리기\n","유닛");
	} // 선택된 대상을 내린다
}
