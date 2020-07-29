import java.util.ArrayList;

public class StuController {
	//list ��ü�� �л� ���� ���
	private ArrayList<StudentVO> list = new ArrayList<StudentVO>();

	// 1.�л����
	public void addStudent(String name, int age, String stuNum, int score) {

		StudentVO vo = new StudentVO(name, age, stuNum, score);
		list.add(vo);

	}

	// 2.����Ȯ��
	public StudentVO select(String ip_name) {

//		for (StudentVO vo : list) {
//			if (ip_name.equals(vo.getName())) {
//				return vo;
//			}
//		}

		for (int i = 0; i < list.size(); i++) {
			if (ip_name.equals(list.get(i).getName())) {
				StudentVO vo = list.get(i);
				return vo;
			}
		}

		return null;
	}

	// 3.��üȮ��
	public ArrayList<StudentVO> selectAll() {
		return list;
	}

	// 4. ����
	public void delete(String ip_name) {
		for (int i = 0; i < list.size(); i++) {
			if (ip_name.equals(list.get(i).getName())) {
				list.remove(i);
			}

		}
	}

}