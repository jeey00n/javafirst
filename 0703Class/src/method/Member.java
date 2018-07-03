package method;

public class Member {
	private String id;

	// id의 getter 나한테 주는 것
	public String getId() {
		return id;
	}

	// id의 setter 내가 보내는 것
	public void setId(String arg) {
		id = arg;
	}

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String p) {
		password = p;
	}

	private String nickname;
	private int age;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 인스턴스 변수들을 출력해주는 메소드
	// 클래스 안에서 클래스에 만들어진 변수를 사용할 때는
	// 인스턴스나 클래스 이름을 기재하지 않습니다.
	public void display() {
		System.out.println("이메일: " + id + "\t" + "비밀번호: " + password + "\t" + "닉네임: " + nickname + "나이: " + age);

	}

	@Override // toString 만든것.
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", nickname=" + nickname + ", age=" + age + "]";

	}

	// static메소드: 클래슷 이름으로 호출할 수 있는 메소드
	// 매개변수에 ...이 있으면 매개변수의 개수에 상관없이 대입 가능.
	public static int sum(int... ar) { // int... << 정수를 몇 개를 넣어도 상관이 없어요.
		int tot = 0;
		int len = ar.length;
		// ar.length를 for문안에 직접 쓰지 말고 변수에 꺼내서 쓰자.

		for (int i = 0; i < len; i = i + 1) {
			tot = tot + ar[i];
		}
		return tot;
	}
}
