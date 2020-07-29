import java.util.ArrayList;
import java.util.Scanner;

public class MainView {
// View 단 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StuController controller = new StuController();

		while (true) {
			System.out.println("1.학생등록 2.개별확인 3.전체인원 4.삭제  5.종료>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====학생등록====");
				System.out.print("이름>> ");
				String name = sc.next();
				System.out.print("나이>> ");
				int age = sc.nextInt();
				System.out.print("학번>> ");
				String stuNum = sc.next();
				System.out.print("점수>> ");
				int score = sc.nextInt();

				// *controller 이용
				// controller.
				controller.addStudent(name, age, stuNum, score);

				System.out.println();
			} else if (choice == 2) {
				System.out.println("====개별검색====");
				System.out.println("검색할 이름 입력: ");
				String ip_name = sc.next();

				StudentVO vo = controller.select(ip_name);
				if (vo != null) {
					System.out.println("이름: " + vo.getName());
					System.out.println("학번: " + vo.getStuNum());
				} else {
					System.out.println("학생이 존재하지 않습니다.");
				}
				System.out.println();

			} else if (choice == 3) {
				System.out.println("====전체확인====");

				ArrayList<StudentVO> list = controller.selectAll();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName());
					// System.out.println("나이: "+list.get(i).getAge());
					System.out.println(list.get(i).getStuNum());
					// System.out.println("점수: "+list.get(i).getScore());
				}
				System.out.println();
			} else if (choice == 4) {
				System.out.println("====학생정보삭제====");
				System.out.println("삭제할 이름 입력: ");
				String ip_name = sc.next();

				controller.delete(ip_name);
				System.out.println(ip_name + "님의 정보가 삭제되었습니다.");

			} else if (choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println();
		}

	}

}
