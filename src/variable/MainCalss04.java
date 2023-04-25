// class변수
package variable;

class TestClass04 {
	//int num =1000; //instance : main 객체가 생성되야 생성 
	static int num =1000; 
	public void test1() {
		test2();
	}
	public void test2() {
		
	}
	
}


public class MainCalss04 {

	public static void main(String[] args) {
		// test(); :오류
		TestClass04.num =444; //static이라 가능 어디서든
		
	}

}
