package variable;

class TestClass05{
	
	static int num;
	static {
		num=100;
	}
	public void test() {
		System.out.println("num" +num);
	}
	/*
	int n1=100;
	
	public static void test2() {
		System.out.println("n1 : "+n1); //오류 : n1 부재
	}
	*/
	static int n1=100;
	public static void test2() {
		System.out.println("n1 : "+n1); //오류 X
	}
	
}

public class MainClass05 {
	static int num=80;
	public static void main(String[] args) {	
		System.out.println(num);
		System.out.println(TestClass06.Path); //다른 공간에서도 사용 가능
			
	}

}
