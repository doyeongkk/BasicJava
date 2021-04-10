package My_game;
//class는 객체의 설계도라고 생각할 수 있다. 
//class에는 멤버변수를 선언하고 메서들을구현해 놓는다.
public class Tv {            //클래스의 이름 Tv
	String color; //색상                        참조형이라서 null들어있음
	boolean power; //전원상태                초기값 false
	int channel;   //채널                     초기값은 0이다
	
	
	//생성자 ==> 반환값자료형이 없고 메서드이름이 class이름과 같다. 
	public Tv(){
		channel = 6;
		int test;
//		test ++;
	}
	
	
	
	
// 메서드 선언 및 구현
	//전원 on  /  off 기능 == 전원 상태를 현재의 반대 상태가 되게 한다. 
	public void powerOnOff(){
//		if(power == true )
//           power = false;
//	}else{
//		power=true;
//	}
	power = !power;
			
	}

	public void channelUp(){   //채널을 올린다.
		int temp;
		channel++;
		
		
		
	}
	
	public void channelDown(){  //채널을 내린다. 
		
	 channel--;
}
	
	
	
	
	
	
	
	
}










