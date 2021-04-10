package c_statment;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int number =0;
		System.out.println("아침을 배불리 먹은 후 점심시간 전에 배가 고프다");
		int a =Integer.parseInt(sc.nextLine());
		if  (a == 1  ){
			number ++;
		}
		
		System.out.println("밥,빵,과자 등 음식을 먹기 시작하면 끝이 없다");
		 a = Integer.parseInt(sc.nextLine());
		if (a ==1 ){
			number ++;
		}
		System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다");
		 a = Integer.parseInt(sc.nextLine());
		if (a ==1 ){
			number ++;
		}	
		System.out.println("정말 배고프지 않더라도 먹을 때가 있다");
		 a = Integer.parseInt(sc.nextLine());
		if (a ==1 ){
			number ++;
		}	
		System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다");
		 a = Integer.parseInt(sc.nextLine());
		if (a ==1 ){
			number ++;
		}	
		System.out.println("스트레스를 받으면 자꾸 먹고 싶어 진다");
		 a = Integer.parseInt(sc.nextLine());
		if (a ==1 ){
			number ++;
		}	
		System.out.println("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다");
		 a = Integer.parseInt(sc.nextLine());
		if (a ==1 ){
			number ++;
		}	
		System.out.println("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다");
		 a = Integer.parseInt(sc.nextLine());
		if (a ==1 ){
			number ++;
		}	
		System.out.println("과자 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다");
		 a = Integer.parseInt(sc.nextLine());
		if (a ==1 ){
			number ++;
		}	
		System.out.println("다이어트를 위해 식이조절을 하는데 3일도 못간다");
		 a = Integer.parseInt(sc.nextLine());
		if (a ==1 ){
			number ++;
		}	
		System.out.println(number);
		
		if(number <= 3){
		System.out.println("주의");
		}
		else if(number >= 4 && number <= 6){
	    System.out.println("위험");
		}
		else if(number >=7){
	    System.out.println("중독");
		}
		
		
	}

}
