package set_get;

class TestClass02{
	private int age;
	public void setAge(int age) {//동일한 이름일 때
		this.age=age-1;
		//age=age-1; 이면 0 출력.
	} 
	public void printAge() {
		System.out.println(age);
	} 
	
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t= new TestClass02();
		t.setAge(20);
		t.printAge();
	}

}
