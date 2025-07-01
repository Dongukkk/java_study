package study.practice.practice52;

public class StudentScoreDTO {

	//student Table
	int studno;
	String name;
	
	//score Table
	int total;
	
	//hakjum Table
	String grade;
	
	public StudentScoreDTO() {}

	public StudentScoreDTO(int studno, String name, int total, String grade) {
		super();
		this.studno = studno;
		this.name = name;
		this.total = total;
		this.grade = grade;
	}

	public int getStudno() {
		return studno;
	}

	public void setStudno(int studno) {
		this.studno = studno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentScoreDTO [studno=" + studno + ", name=" + name + ", total=" + total + ", grade=" + grade + "]";
	}

}
