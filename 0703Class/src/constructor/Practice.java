package constructor;

public class Practice {

	static {
		System.out.println("맨 처음 한 번만 수행되는 내용입니다.");
	}//맨 처음 한 번만 불러주고요,
	
	{
		System.out.println("인스턴스를 만들 때마다 수행되는 내용입니다.");
	}//이건 new Practice 할 때마다 불러줍니다.
	
	// 생성자
	public Practice() {
		name = "noname";
		// 어떤 특정 값으로 초기화하는 걸 만들 수 있다.
	}
	
	//생성자 오버로딩(동일한 이름의 메소드가 2개 이상 있는 경우)
	public Practice(String arg) {
		name=arg;
	}
	
	// 이름을 저장하기 위한 인스턴스 변수를 선언
	private String name;

	// name의 접근자 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		String name="지역변수 name";
		System.out.println(name); // 가까운 곳에 있는 지역변수 name입니다.
		System.out.println(this.name); // this를 붙이면 지역변수에서는 찾지 않고 인스턴스변수에서 찾습니다.
		//두 name을 클릭해서 각각 어떤 name을 받아오는지 눈으로 확인해보세요.
	}
}
