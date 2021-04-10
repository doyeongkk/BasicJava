package 김도영;

import java.util.*;



class Player {

	public String name;                             //게임 참가자 이름  - 문자열 String 사용 
 
    public String word;                             //단어



	public Player(String name) {

		this.name = name;

	}



	// 단어입력받기

	public String sayWord() {                 //사용자로부터 단어를 입력받는 메소드

		Scanner in = new Scanner(System.in);

		word = in.next();

		return word;

	}



	// 끝말 잇기 성공여부 판별

	public boolean succeed(String lastWord) {

		int lastIndex = lastWord.length() - 1;      //마지막 문자에 대한 인덱스

		char lastChar = lastWord.charAt(lastIndex);    //마지막 문자

		char firstChar = word.charAt(0);

		if (lastChar == firstChar) {

			return true;

		}

		return false;



	}

}

