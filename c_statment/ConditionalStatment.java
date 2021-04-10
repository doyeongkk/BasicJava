package c_statment;

import java.util.Scanner;

public class ConditionalStatment {

	public static void main(String[] args) {

		/*
		 * 
		 * 조건문 - if문 -switch
		 * 
		 * 
		 * 
		 * if문 - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다. - else if(조건식){} :
		 * 
		 * 다수의 조건이 필요할때 if뒤에 추가한다. - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */

		// 블록정렬 Ctrl + Shirt + F

		int a = 1;

		if (a == 1) {

			System.out.println("조건식의 연산결과가 true이면 수행된다.");

		}

		if (a == 0) {

			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");

		}

		if (a == 1) {

			System.out.println("a가 1인 경우에 하고싶은 것");

		} else if (a == 2) {

			System.out.println("a가 2인 경우에 하고싶은 것");

		} else if (a == 3) {

			System.out.println("a가 3인 경우에 하고싶은 것");

		} else {

			System.out.println("이외의 경우에 하고싶은 것");

		}

		// 시험점수가 60점 이상이면 합격 그렇지 않으면 불합격

		int score = 70;

		if (score >= 60) {

			System.out.println("합격");

		} else {

			System.out.println("불합격");

		}

		// 성적에 등급을 부여하는 프로그램을 작성해주세요.

		score = 96;

		String grade = null;

		if (score >= 90 && score <= 100) {

			grade = "A";

		} else if (score >= 80) {

			grade = "B";

		} else if (score >= 70) {

			grade = "C";

		} else if (score >= 60) {

			grade = "D";

		} else {

			grade = "F";

		}

		System.out.println(score + " 에 대한 등급은 " + grade + " 입니다.");

		score = 99;

		grade = null;

		if (90 <= score) {

			grade = "A";

			if (97 <= score) {

				grade += "+";

			} else if (score <= 93) {

				grade += "-";

			}

		} else if (80 <= score) {

			grade = "B";

			if (87 <= score) {

				grade += "+";

			} else if (score <= 83) {

				grade += "-";

			}

		} else if (70 <= score) {

			grade = "C";

			if (77 <= score) {

				grade += "+";

			} else if (score <= 73) {

				grade += "-";

			}

		} else if (60 <= score) {

			grade = "D";

			if (67 <= score) {

				grade += "+";

			} else if (score <= 63) {

				grade += "-";

			}

		} else {

			grade = "F";

		}

		System.out.println(score + " 에 대한 등급은 " + grade + " 입니다.");

		/*
		 * 
		 * switch문 - switch(int/String){case 1: break; } - 조건식의 결과는 정수와
		 * 
		 * 문자열만(JDK1.7부터 문자열 허용) 허용한다. - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */

		a = 1;

		switch (a) {

		case 1:

			System.out.println("a가 1인 경우에 하고싶은 것");

			break;

		case 2:

			System.out.println("a가 2인 경우에 하고싶은 것");

			break;

		case 3:

			System.out.println("a가 3인 경우에 하고싶은 것");

			break;

		default:

			System.out.println("a가 1,2,3,이 아닌 경우에 하고싶은 것");

		}

		String b = "a";

		switch (b) {

		case "a":

			System.out.println("b가\"a\"인 경우에 하고싶은 것");

			break;

		case "b":

			System.out.println("b가\"b\"인 경우에 하고싶은 것");

			break;

		default:

			System.out.println("그외의 경우에 하고 싶은 것");

			break;

		}

		// 주어진 월에 해당하는 계절을 출력해봅시다.

		int month = 1;

		String season = null;

		switch (month) {

		case 3:

		case 4:

		case 5:

			season = "봄";

			break;

		case 6:

		case 7:

		case 8:

			season = "여름";

			break;

		case 9:

		case 10:

		case 11:

			season = "가을";

			break;

		default:

			season = "겨울";

			break;

		}

		System.out.println(month + "월은 " + season + " 입니다.");
		
		score = 90;
		grade = null;
		switch(score / 10){
		
		case 9:
		    grade = "A";
		break;
		
		case 8:
		    grade = "B";
		break;
		
		case 7:
			grade = "C";
	    break;
	    
		case 6:
			grade = "D";
		break;
		
		}
		System.out.println(score + "점에 대한 등급은 "+ grade + "입니다.");
		
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		
//		int number1 = Integer.parseInt(sc.nextLine());
//		if (number1 == 0 ){
//			System.out.println("0입니다");
//		} else{
//			System.out.println("0이 아닙니다");
//			
//		}
//		
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
//		
//	    if (number1 % 2 == 0){
//	    	System.out.println("짝수입니다");
//	   }  else{
//		    System.out.println("홀수입니다");
//	   }
//	    
	    // 점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		
//		System.out.println("숫자 3개를 입력해주세요");
//		
//		int number1 = Integer.parseInt(sc.nextLine());
//		int number2 = Integer.parseInt(sc.nextLine());
//		int number3 = Integer.parseInt(sc.nextLine());
//		int total = number1 + number2 + number3;
//		double avg = total / 3.0;
//		String grade1 = null;
//		if(avg >= 90 && avg <= 100){
//	       grade1 = "A";
//		}   
//	    else if(avg >= 80){
//	       grade1 = "B";
//	    }   
//	    else if(avg >= 70){
//	       grade1 = "C";
//	    }
//	    else if(avg >= 60){	
//	    	grade1 = "D";
//	    }
//	    else{
//	    	grade1 = "F";
//	    }
//	    System.out.println("당신의 평균점수" + avg + "에 대한 등급은" + grade1 + "입니다")
//	    
	    
	    //숫자 3개를 입력받아 오름차순으로 출력해주세요.
		
		//a b c 
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요>");
		int x = Integer.parseInt(s.nextLine());
		System.out.print("두번째 숫자를 입력해주세요");
		int y = Integer.parseInt(s.nextLine());
		System.out.print("세번째 숫자를 입력해주세요");
		int z = Integer.parseInt(s.nextLine());
		
		if(x > y){
			int t = x;
			x = y;
			y = t; 
		}
	
		if(x >  y){
			int t = x;
			 x = z;
			 z = t;
		}
		
		if(y > z){
			int t = y;
			y = z;
			z = t;
		}
		System.out.print(x + "," + y + "," + z);
	}
	   
}
