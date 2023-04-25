package overloading_;

/*
 method  overloading
 - 메소드의 이름을 동이하게 사용하는 것
 - 서로 다른 메소드로 인식하기 위해서는 매개변수의 개수 또는 타입이 달라야함
 */

class TestClass01{
	public void sumF(int n1, int n2) {
		int sum = n1+n2;
		System.out.println(sum);
	}
	
	public void sumF(String n1 , String n2 ) { // 매개변수의 타입과 개수가 달라야함
		String sum= n1+n2;
		System.out.println(sum);
	}
	
}


public class MainClass01 {
	
	public static void main(String[] args) {
		int n1 =10, n2 =20;
		TestClass01 t = new TestClass01();
		t.sumF(n1, n2);
		
		String s1 = "test" , s2 = "hi";
		t.sumF(s1, s2);
		
		
	}
	

}
