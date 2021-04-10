package b_operartor;

public class ComparingOperator {
	public static void main(String[] arhs) {
	/*
	 * 비교연산자
	 * -, <, >, <=, >=, ==, !=
	 * - 문자열비교 : equals()
	
	 */
	boolean b = 10 < 20; //비교연산자의 연산결과는 boolean이다.
	System.out.println(b);
	b = 10 <=- 20 - 50; //산술연산 후 비교연산을 수행한다.
	System.out.println(b);
	
	String str1 = "abc";
	String str2 = "abc";
	b = str1 == str2; //문자열의 내용이 아닌 주소를 비교한 것이다.
	System.out.println(b);
	
	//String의 내용을 비교하기 위해서는 equals()메서드를 사용한다.
	b = str1.equals(str2);
	System.out.println(b);
	b =!str1.equals(str2);
	System.out.println(b);
	
	//int타입의 x와 y변수를 만들고, 다음의 문장들을 코드로 작성해주세요.
	int x = 1;
	int y =	2;
	
	//1.x가 y보다 크다.
	System.out.println(x > y);
	

	//2. x + 5와 y는 같다.
	System.out.println(x + 5 == y);
	
	//3. y는 홀수이다.
	System.out.println(y % 2 == 1);
	
	//4. "변수"와 "데이터"는 같다.
	System.out.println("변수".equals("데이터"));
	
	
	}
}
