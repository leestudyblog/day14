package variable;


class TestClass03{
	//instance(로컬보다 오래 유지) & local(메모리 사용 효율적) 
	int num; // instance  변수 
	public void test01 () {
		num =1000; // local 변수
		System.out.println("test01 :" + num);
	}
	public void test02 () {
		num =1000;
		System.out.println("test02 :" + num);
	}
	
}

public class Mainclass03 {
	
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test01();
		t.test02();	
		
		System.out.println(TestClass04.num); // 다른 클래스 메소드 사용 가능 static: new없이 사용가능
	}
	
	
}
