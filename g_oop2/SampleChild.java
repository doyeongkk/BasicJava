package g_oop2;

import javax.swing.Spring;

public class SampleChild extends SampleParent {

	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);                    //상속받은 변수
		System.out.println(method(7,13));          //상속받은 메서드
	}
	
	//오버라이딩          ---상속받은 메서드를 재정의 하는것
	//super, super() --- 첫번째는 변수 이름 확인 (부모 클래스 변수 이름 = 자식 클래스 변수 이름)일때 구분을 하기 위하여 쓴다. - ()붙은거: 부모클래스의 생성자를 호출 
	//다형성    ---객체의 타입과 변수의 타입이 다르게 사용할때   ex_ABC = new ABC();  아니고 DEF a = NEW ABC(); 이렇게 타입이 다르게 사용했을때.부모 자식관계여야 다르게 사용가능.
	
	//오버라이딩: 상속받은 메서드의 내용을 재정의 하는 것.
	@Override //어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것.
	int method(int a, int b){ //리턴타입 메서드명 파라미터 모두 같아야 한다. 
		return a * b;
	}
	 
	
	//super, super()
	int var;              //변수 
	
	void test(double var){
		System.out.println(var);              //지역변수
		System.out.println(this.var);         //인스턴스 변수 = 전역 변수
		System.out.println(super.var);        //부모 크래스의 인스턴스 변수
		//super: 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다. 
		System.out.println(this. method(10,20));                  
		System.out.println(super.method(10,20));
		
			}
	
	SampleChild(){
	 super(); //부모클래스의 생성자 호출              ----- 반드시 부모클래스를 호출해야한다.
	 //super()를 통해 부모 클래스의 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다.
	 //super()가 없으면 컴파일러가 자동으로 super()를 넣어준다. 
	 
	}
	
	//다형성
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild();
		//부모타입의 변수로 자식타입의 객체를 사용하는 것이 다형성이다. 
		
		//부모와 자식간에는 서로 형변환이 가능하다.
		sc = (SampleChild)sp;              //생략 하면 안된다.
		sp = (SampleParent)sc;            //생략 가능 ( 이거  )
		//자식타입-> 부모타입 형변환은 생략할 수 있다.
		
		SampleChild sc2= (SampleChild) new SampleParent();         //부모 클래스 생성 -> 자식클래스 타입
		//SampleParent는 2개의 멤버를 가지고 있다.                                   //변수와 메서드 2개 갖고 있다.
		//SampleChild는 5개의 멤버를 가지고 있다.                                     //부모 2개와 차일드메서드, int var, void 테스트 
		//SampleChild는 타입의 변수는 5개의 멤버를 사용할 수 있어야 하는데 
		//SampleParent 객체는 2개의 멤버만 가지고 있다.
		//그러므로 부모타입의 객체를 자식타입으로 형변환 하는것은 에러를 발생시킨다. 
		
		//SampleParent 타입의 변수로는 SampleChild 객체를 가지고도 2개의 멤버만 사용할 수 있다.
		SampleParent sp3 = new SampleChild();
		System.out.println(sp3.var);
		System.out.println(sp3.method(10,20));
//		sp3.childMethod(); //사용불가
//		sp3.test(); //사용불가		
		
		
		
		
		
		
	}
	
	
	
	
}




































