package 김도영;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
//클래스에 대해 배우기 전까지 모든 코드는 이곳에 작성된다.
		//메서드: 명령문의 집합
		//main 메서드: 프로그램 시작과 끝 
		
		// 변수 선언: int name;
		//변수 선언과 초기화 int abc= 10;
		              //long l = 40; 접미사 L을 붙여야 long 타입이 된다.
		              //float f = 5.5 f 접미사 f 를 붙여야 float 타입이 된다.
		              //char c = '한'; //따옴표 안에 한글자만 넣어야 한다.
                      //boolean b = true; //true, false
		//문자열 
		String str = "문자 여러개..";
		System.out.println(str);
		
		//입력 
		Scanner sc = new Scanner(System.in); //입력 받기 위한 클래스 
//		import 단축기: Ctrl + Shift + o
           System.out.println("아무거나 입력해주세요");
           
          String sc2= sc.nextLine();   //문자열을 받는 문법
          System.out.println(sc2); 
          
          //자신의 이름을 저장할 변수를 선언해주세요
          String myName;
          
          //위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아주세요.
          System.out.println("이름을 입력해주세요");
          myName = sc.nextLine();
          System.out.println(myName);
          
          
         //자신의 나이를 저장할 변수를 선언해주세요.
          int myAge;
          
          //위에서 선언한 변수를 초기화 하기 휘해 나이를 입력받아주세요.
          
          System.out.println("나이를 입력해주세요");
          myAge = Integer.parseInt(sc.nextLine());
          
          
          
          //위에서 입력받은 이름과 나이를 출력해주세요.
          System.out.println("이름:"+myName +"/나이:"+ myAge);
          System.out.println("Hello");
          

	//3개의 int 형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요
	
	int a = 10;
	int b = 20;
	int c = 30;
	
	int r = a + b + c;
    double avg = r / 3;
    System.out.println("합계:"+r+ "," + "평균:"+ avg);
	
	//반올림
    avg = Math.round(avg);
    System.out.println(avg*10);
	avg = Math.round(avg*10) / 10.0;
    System.out.println(avg);	
	
	//랜덤
    System.out.println((int) (Math.random()* 33) -5);  
    
//    Math.random 값의 범위는 원래 0 <= x < 1이다
	
    int random = (int)(Math.random()*6+1);
    System.out.println(random);
	
	
	//숫자를 입력받고 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요
    // 그 외의 숫자를 입력하며 확인불가를 출력해주세요.
//    
//    Scanner sc1 = new Scanner (System.in);
//    System.out.println("숫자를 입력해주세요");
//    
//    int num = Integer.parseInt(sc.nextLine());
//    String result1 = (num == 1 || num == 3)? "남자" : (num ==2 || num ==4)?
//    		 "여자": "확인불가";
//	System.out.println(gender);
//	
//	
//	
}



/*
 * 논리 연산자
 * && = AND , ||= OR , ! = NOT
 * 피연산자로 boolean만 허용한다.
 */

/*
 * 조건문 if문 -switch 
 * 
 * if문---------- if(조건식){} : 조건식의 결과가 true 이면 블럭안의 문장을 수행한다
 * else if문  -----else if(조건식){}:다수의 조건이 필요할때 if뒤에 추가한다. 
 * else ----------else{}결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다. 
 */
  //블록정렬:Ctrl + Shift + F

int a = 1;
//if(a == 1 );{
{
	System.out.println( "조건식의 연산겨로가가 true이면 수행된다.");


if ( a == 0);
System.out.println("조건식의 연산겨로가가 false 이면 수행되지 않는다.");

//시험점수가 60점 이상이면 합격 그렇지 않으면 불합격

int score = 70;
if(score > 60){
	System.out.println("합격");
} else {
	System.out.println("불합격");
}


//숫자를 입력받아 그 숫자가 0인지 0아닌지를 출력해주세요
Scanner sc = new Scanner(System.in);
System.out.println("숫자를 입력해주세요");

int number1 = Integer.parseInt(sc.nextLine());
if(number1 == 0){
	System.out.println( "0입니다");
}else{
	System.out.println("0이 아닙니다");
	
	}


//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요

if(number1 % 2 == 0){
	System.out.println("짝수입니다");
}else{
	System.out.println("홀수입니다");
		
	}

//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요

   int a1 = Integer.parseInt(sc.nextLine());
   int a2 = Integer.parseInt(sc.nextLine());
   int a3 = Integer.parseInt(sc.nextLine());
   int total = a1 + a2 + a3;
   double avg = total /3.0;
   
   //숫자 3개를 입력받아 오름차순으로 출력해주세요
   
//   a b c
   
   Scanner sc2 = new Scanner(System.in);
   System.out.println("숫자를 입력해주세요>");
   int x = Integer.parseInt(sc.nextLine());
   System.out.println("두번째 숫자를 입력해주세요");
   int y = Integer.parseInt(sc.nextLine());
   System.out.println("세번째 숫자를 입력해주세요");
   int z = Integer.parseInt(sc.nextLine());
   
   
   


   }  
}









