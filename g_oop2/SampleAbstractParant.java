package g_oop2;

public abstract class SampleAbstractParant {     

	void method(){
		
	}

   //추상 메서드: 선언부만 있고 구현부는 없는 메서드
	 abstract void abstractMethod();           //메서드가 선언은 되어있는데 내용은 없다.
	 
}

class SampleAbstractChild extends SampleAbstractParant{
	
	
	@Override
	void abstractMethod(){
		
	}
}
