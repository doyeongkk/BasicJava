package 김도영;

import java.util.Scanner;

public class Study_Sccaner {

	public static void main(String[] args) {
	
	

String str = "문자 여러개..";
System.out.println(str);
	
	
	
Scanner sc = new Scanner(System.in);
System.out.println("아무거나 입력해주세요");

String sc2 = sc.nextLine();
System.out.println(sc2);

String myName;

System.out.println("이름을 입력해주세요");
myName = sc.nextLine();
System.out.println(myName);


int Age;

System.out.println("나이를 입력해주세요");
Age= Integer.parseInt(sc.nextLine());

System.out.println("이름 : " + myName + "/나이:" + Age);





Scanner sc3 = new Scanner (System.in);
System.out.println("이름을 입력해주세요");

String Mynameis;

Mynameis = sc.nextLine();
System.out.println(Mynameis);







	}
}



