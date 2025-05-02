package study.practice.practice33;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.setMajor("전자공학과");
		s1.setStuNum(12345678);
		
		System.out.printf("학과 : %s 	학번 : %d", s1.getMajor(),s1.getStuNum());
	}

}
