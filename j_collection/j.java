package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class j {

	ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>();
	
	HashMap<String, Object> board = new HashMap<>();
	
	int boardNum = 0;
	
	boolean key = false;
	
	
	
	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판은 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * ----------------------------
		 * 번호	제목	  작성자	작성일
		 * ----------------------------
		 * 1	안녕하세요	홍길동	10-05
		 * 1	안녕하세요	홍길동	10-05
		 * 1	안녕하세요	홍길동	10-05
		 * 1	안녕하세요	홍길동	10-05
		 * ----------------------------
		 * 1.조회	2.등록	3.종료
		 */
		
	
		new j().Remote();
		
		
		
		
	}
	
	void Remote(){
		System.out.println("1.조회\t2.등록\t3.종료\t");
		Scanner sc = new Scanner(System.in);
		
		while(true){
		int num = Integer.parseInt(sc.nextLine());
		switch (num) {
		case 1:
			LookupRemote();
			break;
		case 2:
			Enrollment();
			break;
		case 3:
			System.out.println("종료합니다.");
			System.exit(0);
			break;

		default:
			System.out.println("해당되는 번호를 입력해주세요");
			break;
		}
		}
	}
	
	void LookupRemote(){
		Lookup();
		Scanner sc = new Scanner(System.in);

		System.out.println("1.수정\t2.삭제\t3.내용보기\t4.뒤로가기");
		while (true) {
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				Revise();
				break;
			case 2:
				Delete();
				break;
			case 3:
				Contents();
				break;
			case 4:
				Remote();
				break;

			default:
				System.out.println("해당되는 번호를 입력해주세요");
			break;
		}
		}
	}
	
	void Contents(){
		System.out.println("열람할 게시글 번호를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		Object num = Integer.parseInt(sc.nextLine());
		
			for(int i = 0; i<boardTable.size(); i++){
				
			if(num == boardTable.get(i).get("번호")){
			System.out.println("-------------------------------");
			System.out.println( boardTable.get(i).get("내용")+"\t");
			System.out.println("-------------------------------");
			key = true;
			}
			
			}
			
			if(key == false){
				System.out.println("해당번호는 존재하지 않습니다.");
			}
			
			key = false;
			Remote();
		
		
		
		
	}
	
	void Delete() {
		System.out.println("삭제할 게시글 번호를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		Object num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < boardTable.size(); i++) {

			if (num == boardTable.get(i).get("번호")) {
				boardTable.remove(i);
				key = true;
			}
		}

		if (key == false) {
			System.out.println("해당 글번호는 존재하지 않습니다.");
		}

		key = false;
		Remote();
		
			
			
			Remote();
		
	}
	
	void Revise(){
		System.out.print("수정할 게시글 번호를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		Object num = Integer.parseInt(sc.nextLine());
		
			for(int i = 0; i<boardTable.size(); i++){
				
				if(num == boardTable.get(i).get("번호")){
			
			board = new HashMap<>();
			System.out.println("제목을 입력해주세요");
			String title = sc.nextLine();
			System.out.println("작성자 이름을 입력해주세요");
			String name = sc.nextLine();
			Date today = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("내용을 입력해주세요");
			String contents = sc.nextLine();
			board.put("번호", num);
			board.put("작성자", name);
			board.put("작성일", sdf.format(today));
			board.put("제목", title);
			board.put("내용", contents);
			
			
			
			boardTable.set(i,board);
			key = true;
				}
			}
			
			if(key == false){
				System.out.println("해당 글번호는 존재하지 않습니다.");
			}
			
			Remote();
		
			
			
		
	}
	
	void Enrollment(){
		Scanner sc = new Scanner(System.in);
		board = new HashMap<>();
		System.out.println("제목을 입력해주세요");
		boardNum++;
		String title = sc.nextLine();
		System.out.println("작성자 이름을 입력해주세요");
		String name = sc.nextLine();
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("내용을 입력해주세요");
		String contents = sc.nextLine();
		board.put("번호", boardNum);
		board.put("작성자", name);
		board.put("작성일", sdf.format(today));
		board.put("제목", title);
		board.put("내용", contents);
		
		
		
		boardTable.add(board);
		Remote();
	}
	
	void Lookup(){
		Set<String> boardkey = board.keySet();
		System.out.println("-------------------------------");
		System.out.print("번호\t제목\t작성자\t작성일\t");
		System.out.println();
		System.out.println("-------------------------------");
		for(int i = 0; i<boardTable.size(); i++){
			System.out.print( boardTable.get(i).get("번호")+"\t");
			System.out.print( boardTable.get(i).get("제목")+"\t");
			System.out.print( boardTable.get(i).get("작성자")+"\t");
			System.out.print( boardTable.get(i).get("작성일")+"\t");
			System.out.println();
		}
		System.out.println("-------------------------------");
		//Remote();
	}

}