package 김도영;

public class Study2 {

	//메서드: 알바가 할 일(보스가 알바에게 시킨 일)
	//파라미터: 일을 하기 위해 필요한 것(보스가 알바에게 주는것)
	//리턴타입: 일을 하고 난 후 돌려주는 것(알바가 보스에게 주는 것)
	
	//주문 받기 위해 필요한 것? = 없음
	//주문받은 후 보스에게 줄것? = 주문서 = 리턴타입
	public static void main(String[] args) {
		
	
	
	outer: for (int i = 2; i <= 9; i++) {

		for (int j = 1; j <= 9; j++) {

			if (j == 5) {

				// break; //가장 가까운 반복문 하나를 빠져나간다.

				// break outer; //outer이라는 이름의 반복문을 빠져나간다.

				// continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다.

				continue outer; // outer이라는 이름의 현재 반복회차를 빠져나간다.

			}

			System.out.print(i + " * " + j + " = " + i * j + "\t");

		}

		System.out.println();

	}
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

