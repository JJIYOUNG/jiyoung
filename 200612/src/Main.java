import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====g's �ʶ��׽� ȸ�� ���� �ý���====");
			System.out.print("1.��� 2.������ȸ 3.��ü��ȸ 4.ȸ������ 5.���� >> ");
			int input = sc.nextInt();
			
			if(input ==1) {
				System.out.println("====ȸ�����====");
				System.out.print("�̸� �Է�: ");
				String name = sc.next();
				
				System.out.print("���� �Է�: ");
				int age = sc.nextInt();
				
				System.out.print("��ȭ��ȣ �Է�: ");
				String phone = sc.next();
				
				Controller.add(name, age, phone);
				System.out.println("ȸ����ϿϷ�!");
				
				System.out.println();
				
			}else if(input == 2) {
				System.out.println("====������ȸ====");
				System.out.print("��ȸ�� ȸ�� �̸� �Է�: ");
				String name = sc.next();
				MemberVO vo = Controller.select(name);
				
				if(vo != null) {
					System.out.println("�̸�:" + vo.getName());
					System.out.println("����:" + vo.getAge());
					System.out.println("����ȣ:" + vo.getPhone());
				}else {
					System.out.println("ȸ���� �����ϴ�.");
				}
				
				System.out.println();
				
			}else if (input == 3) {
				System.out.println("====��ü��ȸ====");
				ArrayList<MemberVO> list = Controller.selectAll();
				
				for (int i = 0; i < list.size(); i++) {
					System.out.println("�̸�:" + list.get(i).getName());
					System.out.println("����:" + list.get(i).getAge());
					System.out.println("����ȣ:" + list.get(i).getPhone());
					System.out.println();
				}
				
				
			}else if (input == 4) {
				
				System.out.println("====ȸ������====");
				System.out.print("������ ȸ�� �̸� �Է�: ");
				String name = sc.next();
				Controller.del(name);
				System.out.println("ȸ������ �Ϸ�Ǿ����ϴ�.");
				System.out.println();
				
			}else if (input == 5) {
				System.out.println();
				System.out.println("====����====");
				break;
			}
		
			
		}
		

	}

}
