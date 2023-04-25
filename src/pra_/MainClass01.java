/*
 입력, 연산, 출력 기능 생성
 입력 : 이름, 국, 영, 수
 연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급 구하는 기능
 출력 : 이름 ,국영수, 합, 평균, 등급
 등급 : 평균이 90이상A, 80 이상B, 나머지C
 
 */

package pra_;

public class MainClass01 {

	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.input();
		int allsum = t.sum();
		int lealavg = t.avg(allsum);
		String lealGrade = t.grade(lealavg);
		t.print(lealGrade, lealavg, lealavg, allsum, lealavg, lealGrade);
	}

}
