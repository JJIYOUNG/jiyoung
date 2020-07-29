import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====g's 필라테스 회원 관리 시스템====");
			System.out.print("1.등록 2.개별조회 3.전체조회 4.회원삭제 5.종료 >> ");
			int input = sc.nextInt();
			
			if(input ==1) {
				System.out.println("====회원등록====");
				System.out.print("이름 입력: ");
				String name = sc.next();
				
				System.out.print("나이 입력: ");
				int age = sc.nextInt();
				
				System.out.print("전화번호 입력: ");
				String phone = sc.next();
				
				Controller.add(name, age, phone);
				System.out.println("회원등록완료!");
				
				System.out.println();
				
			}else if(input == 2) {
				System.out.println("====개별조회====");
				System.out.print("조회할 회원 이름 입력: ");
				String name = sc.next();
				MemberVO vo = Controller.select(name);
				
				if(vo != null) {
					System.out.println("이름:" + vo.getName());
					System.out.println("나이:" + vo.getAge());
					System.out.println("폰번호:" + vo.getPhone());
				}else {
					System.out.println("회원이 없습니다.");
				}
				
				System.out.println();
				
			}else if (input == 3) {
				System.out.println("====전체조회====");
				ArrayList<MemberVO> list = Controller.selectAll();
				
				for (int i = 0; i < list.size(); i++) {
					System.out.println("이름:" + list.get(i).getName());
					System.out.println("나이:" + list.get(i).getAge());
					System.out.println("폰번호:" + list.get(i).getPhone());
					System.out.println();
				}
				
				
			}else if (input == 4) {
				
				System.out.println("====회원삭제====");
				System.out.print("삭제할 회원 이름 입력: ");
				String name = sc.next();
				Controller.del(name);
				System.out.println("회원삭제 완료되었습니다.");
				System.out.println();
				
			}else if (input == 5) {
				System.out.println();
				System.out.println("====종료====");
				break;
			}
		
			
		}
		

	}

}
