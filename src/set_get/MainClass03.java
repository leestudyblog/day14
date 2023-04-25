package set_get;

class TestClass03{
	private String name;//변수선언0
	private int age;
	public void setName(String n) {
		name=n; // private 변수에 접근하기 위해 사용한다.1
	}
	public void setAge(int a) {
		age=a;
	}
	public String getName() { //반환 타입 맞추기4
		return name;
	}
	public int getAge() {
		return age;
	}
}



public class MainClass03 {
	public static void main(String[] args) {
		
		TestClass03 t = new TestClass03();
		t.setAge(20);
		t.setName("lee");//2
		System.out.println(t.getName()); // 설정된 이름 받아오기 3
		System.out.println(t.getAge());
	
	}

}
