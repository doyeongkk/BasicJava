package e_oop.retaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
	 Alba alba = new Alba();                                    //객체 생성 함/  변수이름: Alba
		
	 String[] order = alba.order();                             //주문 받음
	 System.out.println(Arrays.toString(order));
		
		
	System.out.println("요리 만드는 중.... 완성!!");	
	String[] foods = {"완성된 짜장면", "완성된 탕수육"	};
	
	alba.serve(foods);
	
	alba.pay(order);
	
	
	
	
	
	}

}
