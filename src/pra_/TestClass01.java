/*
 입력, 연산, 출력 기능 생성
 입력 : 이름, 국, 영, 수
 연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급 구하는 기능
 출력 : 이름 ,국영수, 합, 평균, 등급
 등급 : 평균이 90이상A, 80 이상B, 나머지C
 
 */

package pra_;

import java.util.Scanner;

public class TestClass01 {
	
	private String name; 
	private int ko, en, ma;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("국어 : ");
		ko = sc.nextInt();
		System.out.println("영어 : ");
		en = sc.nextInt();
		System.out.println("수학 : ");
		ma = sc.nextInt();
		
	}
	
	public int sum() {
		int sum = ko +en +ma;
		return sum;
	}
	public int avg(int allavg) {
		int avg = allavg/3;
		return avg;
	}
	public String grade(int lealavg) {
		String g;
		if (lealavg >=90 ) {
			g ="A";
		}else if (lealavg >=80 ) {
			g ="B";

		}else {
			g ="C";
		}return g;
	}
	public void print(String name, int myko, int myen, int myma, int myavg, String myg) {
		System.out.println("이름 : " +name);
		System.out.println("국어 : " +myko);
		System.out.println("영어 : " +myen);
		System.out.println("수학 : " +myma);
		System.out.println("평균 : " +myavg);
		System.out.println("등급 : " + myg);
		
	}
	
	
	
	
	
	
	

}
