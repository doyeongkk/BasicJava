package phamarcy;

public class employee {
	//메서드: 직원이 할 일 (약사가 직원에게 시킨 일)
		//파라미터: 일을 하기 위해 필요한 것(약사가 직원에게 주는 것)
		//리턴 타입: 일을 하고 난 후 돌려 주는 것 (직원이 약사에게 주는 것)
		
		//처방전주문 받기 위해 필요한 것? 없음 
		// 처방정 주문 후 약사에게 줄 것?   처방전 = 리턴타입
		
		String[] prescriptionorder(){
			System.out.println("처방약 주문 하시겠습니까?");
			return new String []{"감기약","진통제"};
			
		}
		//처방하기 위해 필요한 것? 약
		//처방 후 약사에게 줄 것? 없음  - 리턴타입
		
		void serve(String [] drugs){              //String = 약
			System.out.println("처방약 나왔습니다");
			
		}
		
		//약값 계산하기 위해 필요한 것? 계산서
		//계산 후 약사에게 줄 것? 없음 - 리턴타입
		
		void pay(String []order){
			System.out.println("1만원입니다. 안녕히가세요."); 
		}
		
		
		}


