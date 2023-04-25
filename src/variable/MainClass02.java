package variable;

class TestClass02{
	int test =111;
	public int test01(){
		int num =100;
		System.out.println("test01 : "+num);
		System.out.println("test01 : "+test); // 큰 범위 변수라 오류 없이 사용가능
		return num;
		
	}
	public void test02(int num){
		
		System.out.println("test01 : "+num); // 파라미터 없으면 오류 : num test01의 지역변수 
		
	}
}


public class MainClass02 {
  public static void main(String[] args) {

	  
	  
	  
	  
	  
	  
	  
  }
}
