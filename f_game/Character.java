package f_game;

public class Character {

	String name; //이름
    int maxHp;   //최대체력
    int  hp;     //체력
	int maxMp;   //최대마나         
	int  mp;     //마나               --기술을 쓸 수 있는 에너지 
	int att;     //공격력
	int def;     //방어력
	int exp;     //경험치
	int level;   //레벨
	Item[] items; //보유아이템
	
	
	Character(String name, int hp, int mp, int att, int def){              //생성자 만듬
		this. name = name;                         //초기화
		this. maxHp = hp;
		this. maxHp = mp;
		this. hp = this.maxHp;
		this. mp = this.maxMp;
		this.att = att;
		this.def  =def;
		this.level =1;
		this.exp = 0;
		this.items = new Item[10];                                          //아이템 총 10개
	}                                           
	
	void showInfo(){    //상태창
		System.out.println("=====================");
		System.out.println("-------------------상태---------------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 :" + level + " (" + exp + "/100)");            //100 = 100이되면 레벨업
		System.out.println("체력 : " + maxHp);
		System.out.println("마나 : " + maxMp);
		System.out.println("공격 : " + att);
		System.out.println("방어 : " + def);
		System.out.println("------------아이템--------------");
	    for(int i = 0; i < items.length; i ++){                               
	    	if(items[i] != null){                                        //null이 아닐때  출력
	    		System.out.println(items[i].itemInfo());
	    	
	    	}
	    }
		System.out.println("=================================");
	}
	
	void attack(Monster m){                                            // 정보 - 누구 공격할건지 (파라미터)
		 int damage = att - m.def;
		 damage = damage <= 0 ? 1 : damage;
		 m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;            //체력만큼만 데미지.
	System.out.println(name + "가 공격으로" + m.name + "에게"                      //name = __변수 캐릭터 이름 m.name =몬스터 이름 
		           + damage + "만큼 데미지를 주었습니다.");
	System.out.println(m.name + "의 남은 HP:" + m.hp );                             //몬스터의 체력이 얼만큼 남았는지 출력
	}
	
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp){		         //경험치가 100이상인 경우 반복
		levelUp();
		this.exp -= 100;                     //레벨업 할때마다 100씩 감소
		
		}
		
	}
	


     void levelUp(){
	   level++;
	   maxHp += 10;
	   maxMp += 5;
	   att += 2;
	   def += 2;
	   hp = maxHp;
	   mp = maxMp;
	   System.out.println("LEVEL UP !!");
     }
	 void getItem(Item item){
		 System.out.println(item.name + "을 획득했습니다.");
		 for(int i = 0; i < items.length; i ++){
			 if (items[i] ==null){
				 items[i] = item;
				 break;
			 }
		 }
		 
		 maxHp += item.hp;
		 maxMp += item.mp;
		 att += item.att;
		 def += item.def;
		 
		 }   
	 { 
	   
}


     }















