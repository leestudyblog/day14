package variable;

import java.util.Scanner;

public class TestClass07 {

	private int age;
	private String name;
	public int input() { //메소드 퍼블릭, 인스턴스 프라이빗
		/*입력, 출력, 만나이로 연산하는 각각의 기능을 만드세요
		 변수는 인스턴스 변수로 변경하여 사용*/
		//입력
		Scanner input = new Scanner(System.in);
		System.out.println("이름입력");
		name= input.next();
		System.out.println("나이입력");
		age= input.nextInt();
		return age;
		
	}
	//연산
	public void realage(int age) {
		age -= 1;
		//return age;
	}
	
	//출력
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("만나이 : "+age);
	}
	
}
