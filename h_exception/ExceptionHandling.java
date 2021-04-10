package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.FieldPosition;

import d_array.TEST;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * 에러
		 * - 컴파일 에러: 컴파일 시에 발생되는 에러(빨간줄)         ---컴파일: 컴퓨터가 알아듣게 번역하는거
		 * - 논리적 에러: 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * - 런타임 에러: 실행 시에 발생되는 에러                                  ---실행되다가 중간에 발생
		 * 
		 * 런타임 에러
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러: 프로그램 코드에 의해 수습될 수 없는 심각한 오류(처리 불가)
		 * - 예외: 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류(처리 가능)
		 * 
		 * 예외
		 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
		 * - [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은
		 * 예외처리가 강제된다.
		 * 
		 * 예외처리(try-catch) ---------Runtime에러 제외한 모든 클래스 해줘야됨 
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try {} catch(Exception e){}
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 ()안에는 처리할 예외를 지정해 줄 수 있다.
		 * - 여러 종류의 예외를 처리할수 있도록 catch하나 이상 올 수 있다. 
		 * - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try - catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		 */
	     try{ 
		int result = 10 / 0;     //10이라는 정수를 0으로 나눔 - 예외발생 0으로 나눌수 없으니까.
		System.out.println(result);
	     }catch(ArithmeticException | IndexOutOfBoundsException e){                               //여기로 넘어옴 
	    	 e.printStackTrace(); //예외 메시지를 출력한다.
	     }catch(NullPointerException e){              //Null을 참조 했다. 
	    	 String str = null;
	    	 System.out.println(str.length());
	     }catch(Exception e){
	    	      }
	    test1();
	    /*
	     * JVM
	     *- Method Area
	     *- Call Stack: 현재 호출되어 있는 메서드 
	     *- Heap
	     */
	}
	private static void test1() {
		test2();
	}
	private static void test2(){
//		System.out.println(10/ 0);        //여기가 에러 발생했을 확률이 높다 -가장 최근 오류 발생지점지
	 try {
		new FileInputStream("");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	
	}
	
		}
	
	
	
	






















