package constructor;

public class Main {

	public static void main(String[] args) {
		// Practice클래스의 인스턴스 생성
		Practice practice1 = new Practice();
		// practice1.setName("noname");
		// 얘는 위쪽 생성자를 불러온 것이고

		Practice practice2 = new Practice();
		// practice2.setName("noname");

		Practice practice3 = new Practice("Park");
		// 얘는 아래쪽 생성자를 불러온 것이다.

		System.out.println(practice1.getName()); // noname
		System.out.println(practice2.getName()); // noname
		System.out.println(practice3.getName()); // Park

		// 결과는 같지만 과정이 달라요.

		String str = "Hello world";
		int r = str.lastIndexOf("llok");
		System.out.println(r);//-1

		r = str.length();
		System.out.println(r);//11
		
		practice3.display();
	}
}
