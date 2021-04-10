package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식: 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^          뒷 문자로 시작
		 * $          앞 문자로 종료                         $앞에 a있다면 a문자로 글자가 끝나는지 
		 * .          임의의 문자 (줄바꿈 제외)    모든 문자 표현 가능 줄바꿈만 빼고 
 		 * *          앞 문자가 0개 이상                   별 앞에 있는 문자가 0개 이상 - 없을수도, 여러개있을수도 
		 * +          앞 문자가 1개 이상                   
		 * ?          앞 문자가 없거나 1개
		 * []         문자의 집합이나 범위([a-z]: a부터 z까지, [^a-z]:a부터 z가 아닌것)
		 * {}         앞 문자의 개수 ({2} : 2개, {2,4}: 2개 이상 4개 이하)
		 * ()         그룹화(1개의 문자처럼 인식)
		 * |          OR연산
		 * \s         공백, 탭, 줄바꿈
		 * \S         공백, 탭, 줄바꿈이 아닌 문자 
		 * \w         알파벳이나 숫자
		 * \W         알파벳이나 숫자가 아닌 문자
		 * \d         숫자
		 * \D         숫자가 아닌 문자
		 *(?i)        뒷문자의 대소문자 구분 안함
		 * \          정규표현식에서 사용되는 특수문자 표현 
		 */

		String str = "abc123";     //범위가 좁은 정확한 식을 사용하는게 좋다. 
//		String regex = "[a-z]{3}[0-9]{1,3}";  /{1,  3}이렇게 공백이 들어가면 안된다. 
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
		String regex = ".*";
//		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//	    System.out.println(m.matches());
		
	    //아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
	    
	    
	    String id = "kimdo5175";
	    String regex1 = "[a-z]{5}[0-9]{1,4}";
	    String hp = "01068211364";
	    String regex2= "[0-9]{1,11}";
	    String address ="kimdo5175";
	    String regex3 = "[a-z]{5}[0-9]{1,4}";

		Pattern p = Pattern.compile(regex1);
		Matcher m = p.matcher(id);
	    System.out.println(m.matches());
		
	    

		Pattern p1 = Pattern.compile(regex2);
		Matcher m1 = p1.matcher(hp);
	    System.out.println(m1.matches());
		

		Pattern p2= Pattern.compile(regex3);
		Matcher m2 = p2.matcher(address);
	    System.out.println(m2.matches());
		
	    
	    
	  
	    
	    
	    
	    
	    
	}

}











