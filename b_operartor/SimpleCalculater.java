package b_operartor;
import java.util.Scanner;

public class SimpleCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		
		Scanner sc = new Scanner(System.in);
		
		
	    System.out.println("첫번째 숫자를 입력해주세요");
		int number1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 숫자를 입력해주세요");
		int number2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("연산자를 입력해주세요");
		String a = sc.nextLine();
		
		
		
		System.out.println(a.equals("+")? number1 + number2 : a.equals("-")? number1 - number2 :a.equals("*")? number1 * number2 : a.equals("/")? number1 / number2 : 
			a.equals("%")? number1 % number2 : "연산자가 잘못되었습니다");
	}

}
