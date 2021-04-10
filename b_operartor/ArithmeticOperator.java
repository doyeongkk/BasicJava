package b_operartor;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * 산술 연산자
         * - 사칙연산 : +, -, *, /, %(나머지)
         * - 복합연산자: +=, -=, *=, /=, %=
         * - 증감연산자: ++, --
         */
		
		int result = 10 + 20 - 30 * 40 /50 % 60;
		//곱하기와 나누기가 더하기 빼기보다 우선순위가 높다.
		
		//나머지 연산
		result = 10 % 3;
		System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개의 연산식을 작성 후 연산결과를 출력해주세요.
		result = 10 % 2;
		System.out.println(result);
	
	    result = 17 * 12;
		System.out.println(result);
		
		result = 23 + 19;
		System.out.println(result);
		
		result = 89 - 22;
		System.out.println(result);
		
		//복합연산사
		//변수에 저장되어 있는 값에 연산을 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
		result = result + 3;
		System.out.println(result);
		
		result += 3;
		System.out.println(result);
		
		result -= 5;
		System.out.println(result);
		
		result *= 2;
		System.out.println(result);
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		result += 10;
		
		
		//result = result - 2 * 3;
		result -= 2 * 3;
		//result = result % 5;
	 	result %= 5;
		
	 	//증감연산자
	 	//증가연산자(++) : 변수의 값을 1 증가 시킨다.
	 	//감소연산자(--) : 변수의 값을 1 감소 시킨다.
	 	int i = 0;
	 	
	 	++i; //전위형: 변수의 값을 읽어오기 전에 1 증가된다.
	 	i++; //후위형: 변수의 값을 읽어온 후에 1 증가된다.
	 	--i;
	 	i--;
	 	
	 	i = 0;
	 	System.out.println("++i = " + ++i);
	 	i = 0;
	 	System.out.println("i++ = " + i++);
	 	System.out.println(i);
	 	
	 	//피연산자의 타입이 서로 같아야만 연산이 가능하다.
	 	int _int = 10;
	    double _double = 3.14;
	    double result2 = (double)_int + _double;//표현범위가 더 큰 타입으로 형변환된다.
	    System.out.println(result2);
	    
	    byte _byte = 5;
	    short _short = 10;
	    int result3 = (int)_byte +(int) _short; //int보다 작은 타입은 int로 형변환된다.
	    System.out.println(result3);
	    
	    //오버플로우, 언더플로우
	    //표현범위를 벗어나는 값을 표현할 때 발생하는 현상
	    byte b = 127;
	    b++;
	    System.out.println(b);
	    b--;
	    System.out.println(b);
	    
	    //타입을 선택할 때는 연산의 범위를 고려해야한다.
	    
	    //다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
	    //1. 123456 + 654321
	    //2. 1번의 결과값 * 123456
	    //3. 2번의 결과값 / 123456
	    //4. 3번의 결과값 = 654321
	    //5. 4번의 결과값 % 123456
	    
	    double result1 = 123456 + 654321;
	    System.out.println(result1);
	    result1 *= 123456;
	    System.out.println(result1);
	    result1 /=123456;
	    System.out.println(result1);
	    result1 -=654321;
	    System.out.println(result1);
	    result1 %=123456;
	    System.out.println(result1);
	    
	    //3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
	   int A = 10;
	   int B = 20;
	   int C = 30;
	   
	   int R = A + B + C;
	   double avg = R / 3;
	   System.out.println("합계 : "+ R + "," + " 평균: " + avg);
	   
	   //반올림
	   avg = Math.round(avg);
	   System.out.println(avg*10);
	   avg = Math.round(avg * 10) / 10.0;
	   System.out.println(avg);
			   
	   //랜덤
	   System.out.println((int)(Math.random() * 100  + 1));
	   //Math.random() : 0.0 ~ 1.0 미만
	   
	  
	   
		
		
		
		}

}
