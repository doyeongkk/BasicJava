package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
              /*
               * Object put(Object key, Object value): 지정된 키와 값을 저장한다.
               * Object remove(Object key): 저장된 키로 저장된 값을 제거한다.
               * Object get(Object key): 지정된 키의 값(없으면 null)을 반환한다.
               * set keySet (): 저장된 모든 키를 Set으로 반환한다.
               */
	
		HashMap<String, Object> map = new HashMap<>();       //<키 = String 많이 사용,  값의 타입> 변수이름
	    
		map.put("a", 10);
	    map.put("b", "홍길동");
	    map.put("c", new Date());
	    
	    
	    System.out.println(map);
	  
	    map.put("b", "이순신"); //덮어쓴다.
	    
	    System.out.println(map);

	    
	    map.remove("a");
	    
	    System.out.println(map);
	    
	    Object value = map.get("b");
	    System.out.println(value);
	    
	    Set<String> keys = map.keySet(); //저장된 모든 키를 가져오는 메서드 
	    
	    for(String key : keys){                                
	    	System.out.println(key + " : " + map.get(key));   //값에 있는 모든 값을 꺼낼때까지 for문 실행한다. 
	    }
	    
	    HashMap<String, Object>  lprod = new HashMap<>();
	    lprod.put("LPROD_ID", 1);
	    lprod.put("LPROD_GU", "P101");
	    lprod.put("LPROD_NM", "컴퓨터제품");
	    
	    ArrayList<HashMap<String, Object>> table = new ArrayList<>();
	    table.add(lprod);
	    
	    System.out.println(table);
	    
	    lprod = new HashMap<>();
	    lprod.put("LPROD_ID", 2);
	    lprod.put("LPROD_GU", "P102");
	    lprod.put("LPROD_NM", "전자제품");
	    
	    table.add(lprod);
	    
	    System.out.println(table + "\n");
	    
	    //ArrayList와 HashMap을 사용해 DEPT테이블의 구조를 만들어 주시고
	    //저장된 모든값을 출력해주세요. 
	    HashMap<String, Object> dept = new HashMap<>();   //dept이름으로 HashMap으로 초기화
	    dept = new HashMap<>();
	    
	    ArrayList<HashMap<String, Object>> deptTable = new ArrayList<>();  // deptTable을 HashMap형식으로 ArrayList로 표현할거다. 
	    
	    
	    
	    dept.put("DEPTN0",10);
	    dept.put("DNAME", "ACCOUNTING");
	    dept.put("LOC","NEW YORK");
	    
	    deptTable.add(dept);

	    dept = new HashMap<>();
	    
	    dept.put("DEPTNO", 20);
	    dept.put("DNAME", "RESEARCH");
	    dept.put("LOC", "DALLAS");
	    
	    deptTable.add(dept);
	    
	    dept = new HashMap<>();
	    
	    dept.put("DEPTNO", 30);
	    dept.put("DNAME", "SALES");
	    dept.put("LOC", "CHICAGO");
	    
	    deptTable.add(dept);
	    
	    dept = new HashMap<>();
	    
	    dept.put("DEPTNO", 40);
	    dept.put("DNAME", "OPERATIONS");
	    dept.put("LOC", "BOSTON");

	    deptTable.add(dept);
	    
//	    Set<String> key = map.keySet(); 

	
	   
	    for(int i = 0 ; i <deptTable.size(); i ++){
	    	HashMap<String, Object> d =  deptTable.get(i);
	    	Set<String> keySet = d.keySet();
	    	for(String key : d.keySet()){
	    		System.out.println(key + ":" + d.get(key));
	    	}
	    System.out.println("--------------------------");
	    }
	    
	    
	
	}

}



















