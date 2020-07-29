
public class MemberVO {
	//클래스 객체 (여러 데이터 타입 담고 있음, arraylist에 담아주기 위함)
	private String name;
	private int age;
	private String phone;
	
	public MemberVO(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
