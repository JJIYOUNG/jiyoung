
public class StudentVO {
	
	// 데이터 타입이 다른 학생 정보를 하나로 묶어주는 StudentVO 클래스 객체로 묶어서 list에 담을 수 있음.
	private String name;
	private int age;
	private String stuNum;
	private int score;

	public StudentVO(String name, int age, String sutNum, int score) {
		super();
		this.name = name;
		this.age = age;
		this.stuNum = sutNum;
		this.score = score;
	}

	/*
	 * public StudentVO(String name, String sutNum) { super(); this.name = name;
	 * this.stuNum = sutNum;
	 * 
	 * }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String sutNum) {
		this.stuNum = sutNum;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
