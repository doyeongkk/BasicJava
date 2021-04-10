package i_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
	 Date today = new Date();
     System.out.println(today);
     
     //날짜 -> 문자열
       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");  //대소문자를 가림
       SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.SSS"); //HH:24시간 기준//mm:분//ss:초//SSS:천분의 1초 단위
       SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd(E) hh:mm:ss a");//yy: 년도중에 두자리만표현 (ex-2020->20)/hh:12시간 기준 a:오전,오후 표시 ㅡ>오전
       
       System.out.println(sdf1.format(today));
       System.out.println(sdf2.format(today));
       System.out.println(sdf3.format(today));
       System.out.println(sdf4.format(today));
       
       //문자열 -> 날짜
       String str = "1987년 05월 01일";
       SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
       try {
		Date dateStr = sdf5.parse(str);
		System.out.println(dateStr);
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
      
       Calendar cal = Calendar.getInstance(); //싱글톤 패턴
       
       cal.setTime(new Date());
       cal.set(2020, 8, 29);  //2020/09/29 (월은 0부터 시작)
       
       System.out.println(cal.getTime());
       
       //날짜 계산
       cal.add(Calendar.YEAR, 1);
       cal.add(Calendar.MONTH,2);
       cal.add(Calendar.DAY_OF_MONTH,-3);
       cal.add(Calendar.HOUR,4);
       cal.add(Calendar.MINUTE,10);
       cal.add(Calendar.SECOND,-15);
       
       System.out.println(sdf3.format(cal.getTime()));
     
       
       
       
       
       
	}

}

















