package e_oop;

public class OOP {

	public static void main(String[] args) {
          /*
           * 객체지향 프로그래밍(Object Oriented Programming)
           * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것.
           * - 코드의 재사용성이 높고 유지보수가 용이하다.
           */                
		
		SampleClass sc = new SampleClass();                                              //객체생성
		
		System.out.println(sc.field);
		
		sc.method1();
		
		String returnValue = sc.method2(5);
		System.out.println(returnValue);
        
		System.out.println(sc.method2(10));                       
  		
		sc.flowTest1();
		
		
		// 방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 변수를 통해 메서드를 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요.
		
		
		
		ClassMaker cm = new ClassMaker(); 
		// 방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		
        cm.method1();
        
        cm.method2();
        System.out.println(cm.method2());
      //객체가 저장된 변수를 통해 메서드를 호출해주세요.
        
        
        cm.method3(1);
      //파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
        
        System.out.println(cm.method4(15,1));
      //리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요.
        
        //다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
        //Calculator 클래스 보기. 
        
      
         Calculator cm1 = new Calculator();
         
         //1. 123456 + 654321 
         double result = cm1.plus(123456,654321);
         
         //2.  1번의 결과값 - 123456
         double result2 = cm1.minus(result, 123456);
         
         //3. 2번의 결과값 * 123456
         double result3 = cm1.multi (result2, 123456);
         
         //4. 3번의 결과값 / 654321
         double result4 = cm1.devision (result3, 654321);
         
         //5. 4번의 결과값 % 123456
         double result5 = cm1.remain (result4, 123456);
         
         //최종 결과값 = 0 
         System.out.println(result5);
         
        /*
         * 식당 예제와 같은 어떤 대상을 잡아 클래스를 구성해주세요.
         * 사장님과 알바의 관계같은 명령을 주고받는 관계가 있는 대상이 적합합니다.
         * 메서드의 내용은 구체적이지않아도 괜찮습니다.
         * 파라미터와 리턴타입 위주로 만들어주세요.
         * 클래스에메서드를 만들어보면서 파라미터와 리턴타입을 생각해보는것이 중요합ㄴ디ㅏ.
         * 만들어진 클래스를 main 메서드에서 사용해주세요. 
         */
        
        
        
        
		
		}

}
