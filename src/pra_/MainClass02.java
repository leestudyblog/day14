/*
 로그인 프로그램
 Login Class {private id, pass} -> 각 set,get 생성 및 연산하는 기능
 MainClass {보여지는 기능, 1.로그인 2. 회원가입 3. 종료} 
 */

package pra_;

import java.util.Scanner;

class Login{
	private String id, pass;
	
}

public class MainClass02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Login log= new Login();
		
		boolean bool = true;
		int index=0, cnt=0, num;

		String [] myid = new String[5];
		String [] mypass = new String[5];
		
		String inputId=null, inputPass=null;
		
		while(bool) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			System.out.println("선택");
			num=sc.nextInt();
			
			switch(num) {
			case 1: 
				
				System.out.println("아이디 입력");
				inputId=sc.next();
				//log.setId(inputId);
				System.out.println("비밀번호 입력");
				inputPass=sc.next();
				//log.setpass(inputPass);
				
				//입력값 확인
				for (int i=0; i<myid.length; i++) {
					if(inputId.equals(myid[i])) {
						if(inputPass.equals(mypass[i])) {
							System.out.println("인증통과");
						}else {System.out.println("비밀번호 오류");
						} bool=false; break;
					}
				}
				if(bool) {
					System.out.println("회원가입 필요");
				}
				System.out.println("로그인"); break;
				
				
			case 2: 
				System.out.println("아이디 입력 : ");
				inputId=sc.next();
				System.out.println("비밀번호 입력 : ");
				inputPass=sc.next();
				
				if(cnt<myid.length) {
					for (index=0; index<cnt; index++) {
						if(inputId.equals(myid[index])) {
							System.out.println("중복된 아이디");
						}break;
					}
				}
				if(index==cnt) {
					myid[cnt] = inputId;
					mypass[cnt] = inputPass;
					cnt++;
				}else {
					System.out.println("저장공간 부족!!");
				}
				System.out.println("회원가입"); break;
			case 3: System.out.println("종료"); bool=false; break;
			
			}
		}
		
		
		
		
	}

}
