package variable;

class TestClass06{
	private int num=100; //* 은닉화
	public void test() {
		num=111; //내부에서는 접근 가능
	}
	public void test2() {
		System.out.println(num);
	}
	// * static final : 공통적으로 사용하는 변수 , 다른 곳에서 사용 가능
	public static final String Korea = "대한민국"; 
	public static final String Path= "특정 위치"; 
	
	
}


public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		t.test();
		t.test2();
		
		
		
		}
}
