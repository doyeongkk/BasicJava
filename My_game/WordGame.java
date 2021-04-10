package My_game;
import java.util.*;



class Player {

	public String name;

	public String word;



	public Player(String name) {

		this.name = name;

	}



	// 단어입력받기

	public String sayWord() {

		Scanner in = new Scanner(System.in);

		word = in.next();

		return word;

	}



	// 끝말 잇기 성공여부 판별

	public boolean succeed(String lastWord) {

		int lastIndex = lastWord.length() - 1;

		char lastChar = lastWord.charAt(lastIndex);

		char firstChar = word.charAt(0);

		if (lastChar == firstChar) {

			return true;

		}

		return false;



	}

}



public class WordGame {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("게임에 참가하는 인원은 몇 명 입니까?");

		Scanner sc = new Scanner(System.in);

		int pNum = sc.nextInt();

		int i = 0;

		boolean game = true;

		String starWord = "아버지";

		String uName, inputWord;

		Player[] p;

		p = new Player[pNum];

		for (int n = 0; n < pNum; n++) {

			System.out.println("이름을 입력하세요.");

			sc = new Scanner(System.in);

			uName = sc.next();

			p[n] = new Player(uName);

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

			System.out.print(p[i].name + " >> ");

			inputWord = p[i].sayWord();

			game = p[i].succeed(starWord);

			starWord = inputWord;

			i++;

		}

		System.out.println(p[i - 1].name + "님은 패배하였습니다.");



	}

}



