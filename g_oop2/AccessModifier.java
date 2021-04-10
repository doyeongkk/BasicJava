package g_oop2;

public class AccessModifier {
      //외우기
	public String publicVar = "public: 접근제한이 없음";
	protected String protectedVar = "protected: 같은 패키지: 상속받은 클래스에서 접근 가능";
	String defaultVar = "default : 같은 패키지에서만 접근 가능";
	private String privateVar= "private : 클래스 내에서만 접근 가능";
	
	public void publicMethod(){
		System.out.println(publicVar);
		
		
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	private void privateMethod(){
		System.out.println(privateVar);
	}
	public static void main(String[] args){
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();

	/*
	 * 접근제어자를 사용하는 이유
	 * - 데이터를 보호하기 위해
	 * - 불필요한 멤버를 감추기 위해
	 */
	/*
	 * 빅맥
	 * 1955
	 * 상하이
	 * 
	 * private 양상추
	 * private 패티
	 * private 캐첩
	 * private 마요네즈
	 * 	
	 */
	
	Time t =new  Time();
//	
//	t.hour = 9;
//	t.minute = 390;
//	t.second = -50;
//	
	
	
	t.setHour(9);
	t.setMinute(390);
	t.setSecond(-50);
	System.out.println(t.getTime());
	
	t.clock();
	}

}














