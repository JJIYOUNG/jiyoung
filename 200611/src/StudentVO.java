
public class StudentVO {
	
	// ������ Ÿ���� �ٸ� �л� ������ �ϳ��� �����ִ� StudentVO Ŭ���� ��ü�� ��� list�� ���� �� ����.
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
