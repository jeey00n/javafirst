package method;

import java.util.Scanner;

//실행클래스-main메소드를 소유한 클래스
public class Main {

	public static void main(String[] args) {
		// Member class의 instance를 생성합니다.
		Member member1 = new Member();
		Scanner sc = new Scanner(System.in);

		// 인스턴스 변수를 호출해서 데이터를 저장합니다.
		System.out.println("아이디를 입력하세요: ");
		String id = sc.next();
		member1.setId(id);
		System.out.println("닉네임을 입력하세요: ");
		String nickname = sc.next();
		member1.setNickname(nickname);
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		member1.setAge(age);
		System.out.println("비밀번호를 입력하세요: ");
		String password = sc.next();
		member1.setPassword(password);
		sc.close();

		/*
		 * System.out.println("이메일: " + member1.id + "\t" + "비밀번호: " + member1.password
		 * + "\t" + "닉네임: " + member1.nickname + "나이: " + member1.age);
		 */
		// 위의 출력문 대신 메소드를 이용해서 출력.

		// member1.display();
		System.out.println(member1);
		System.out.println(Member.sum(10, 30)); //40
		System.out.println(Member.sum(10, 20, 30)); //60
		System.out.println(Member.sum(10)); //10
		
		long m=Math.max(100, 200);
		System.out.println(m);
		//static이 붙은 메소드. 클래스 이름을 가지고 호출했어요.
	}

}
