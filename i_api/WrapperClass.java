package i_api;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
	/*
	 * Wrapper 클래스: 기본형 타입을 객체로 사용헤야 할 때 대신 사용하는 클래스
	 * - boolean :Boolean
	 * - char : Character
	 * - byte : Byte
	 * - short: Short
	 * - int : Integer
	 * - long: Long
	 * - float : Float
	 * - double: Double
	 */

	Integer iw = new Integer(20);
		
	System.out.println(Integer.TYPE + "/ " + Integer.SIZE +"bite");	
		
	System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);	
		
	 int parsInt = Integer.parseInt("20");          //반드시 숫자로 이루어진 문자열이여야한다.
	 
	 ArrayList<Integer> list = new ArrayList<>();   //ArrayList: 사용하기 쉬운 배열/길이 지정하지 않고 저장하면 저장한 만큼 길이가 늘어난다/객체만 저장가능/기본형 저장 못함
	                                                              
	 list.add(new Integer(10));
	 list.add(10); // 오토박싱: 기본형타입이 wrapper 클래스로 자동 변환 
	 
	 Integer integer = list.get(0);
	 int i = list.get(0); //언박싱: wrapper 클래스가 기본형타입으로 자동 변환 
	
	
	}

}





