import java.util.ArrayList;

public class Controller {
	static ArrayList<MemberVO> list = new ArrayList<MemberVO>();

	public static void add(String name, int age, String phone) {
		MemberVO vo = new MemberVO(name, age, phone);
		list.add(vo);
	}
	
	private void syso() {
		syso();
	
	}
	
	//2. 개별확인
	public static MemberVO select(String name) {
		for (MemberVO vo :list) {
			if(name.equals(vo.getName())) {
				return vo;
			}
		}return null;
	}
	
	//3.전체확인
		public static ArrayList<MemberVO> selectAll() {
				return list;
			
		}
	
	//4.회원삭제
	public static void del(String name) {

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName()))
				list.remove(i);
		}

	}

	

}
