import java.util.ArrayList;
import java.util.Scanner;

public class MainView {
// View �� 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StuController controller = new StuController();

		while (true) {
			System.out.println("1.�л���� 2.����Ȯ�� 3.��ü�ο� 4.����  5.����>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====�л����====");
				System.out.print("�̸�>> ");
				String name = sc.next();
				System.out.print("����>> ");
				int age = sc.nextInt();
				System.out.print("�й�>> ");
				String stuNum = sc.next();
				System.out.print("����>> ");
				int score = sc.nextInt();

				// *controller �̿�
				// controller.
				controller.addStudent(name, age, stuNum, score);

				System.out.println();
			} else if (choice == 2) {
				System.out.println("====�����˻�====");
				System.out.println("�˻��� �̸� �Է�: ");
				String ip_name = sc.next();

				StudentVO vo = controller.select(ip_name);
				if (vo != null) {
					System.out.println("�̸�: " + vo.getName());
					System.out.println("�й�: " + vo.getStuNum());
				} else {
					System.out.println("�л��� �������� �ʽ��ϴ�.");
				}
				System.out.println();

			} else if (choice == 3) {
				System.out.println("====��üȮ��====");

				ArrayList<StudentVO> list = controller.selectAll();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName());
					// System.out.println("����: "+list.get(i).getAge());
					System.out.println(list.get(i).getStuNum());
					// System.out.println("����: "+list.get(i).getScore());
				}
				System.out.println();
			} else if (choice == 4) {
				System.out.println("====�л���������====");
				System.out.println("������ �̸� �Է�: ");
				String ip_name = sc.next();

				controller.delete(ip_name);
				System.out.println(ip_name + "���� ������ �����Ǿ����ϴ�.");

			} else if (choice == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.println();
		}

	}

}
