package 김도영;

import java.util.Scanner;                     //외부 클래스 호출

public class Word_game {

	public static void main(String[] args) {

		

		System.out.print("게임에 참가하는 인원은 몇 명 입니까?");

		Scanner sc = new Scanner(System.in);      //Scanner 클래스 입력받기 (객체생성)

		int pNum = sc.nextInt();    //플레이어 수만큼 이름 입력 next + 자료형()

		int i = 0;

		boolean game = true;

		String starWord = "자바";     //처음 시작말 -  첫단어 설정

		String uName, inputWord;

		Player[] p;

		p = new Player[pNum];                 
 
		for (int n = 0; n < pNum; n++) {         //플레이어 수만큼 이름 입력

			System.out.println(
					"참가자의 이름을 입력하세요.");

			sc = new Scanner(System.in);

			uName = sc.next();  

			p[n] = new Player(uName);        //코드 정의해주기

		}

		for (int m = 0; m < pNum; m++) {

			System.out.println("게임 참가자 " + m + " " + p[m].name);

		}

		System.out.println("시작하는 단어는" + starWord + "입니다.");

		// game가 '참'일 경우 게임 계속진행

		while (game) {

			if (i > pNum || i == pNum) {
                           i = 0;
			}

			System.out.print(p[i].name + " >>");

			inputWord = p[i].sayWord();                //사용자의 단어 입력 받기

			game = p[i].succeed(starWord);

			starWord = inputWord;

			i++;

		}

		System.out.println(p[i -1 ].name + "님은 패배하였습니다.");



	}

}