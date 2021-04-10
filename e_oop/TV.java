package e_oop;

public class TV {

	// TV의 속성 - 채널, 음량, 전원버튼 을 변수로 만들고 그 변수를 조작할 수 있는 메서드를 만들기. 
	// 전원 변경하는 메서드 - 버튼은 1개 가지고 켤수도 끌수도 - 메서드1개를 만들어서 키거나OR 끔 = 메서드 1개 
	//채널을 변경하는 방법 - 1.채널을 직접 입력 = 숫자 입력 2.채널을 1씩 증가시키는 방법 3.채널을 1씩 감소시키는 방법 = 3개의 메서드 있으면 됨.
	//볼륨 - 음략을 올리거나, 내리거나 = 2개의 메서드를 만듬. 

static class Tv{

int channel;
int volume ;
static boolean power;

void power(){
	power = !power;               //전원을 켜고 끄는 메서드
}

void channelUp(){                 //채널을 하나 증가시키는 메서드 
	channel++;
}

void channelDown(){               //채널을 하나 감소시키는 메서드
	channel--;
}

void volumeUp(){                  //볼륨을 증가시키는 메서드
	volume++;
}

void volumeDown(){                //볼륨을 감소시키는 메서드
	volume--;
}

static int var;
public static void main(String[] args) {
	Tv t;
	t = new Tv();
	t.channel = 7;
	t.channelDown();
	System.out.println("현재 채널은" + t.channel + "입니다.");
	
	
//	
//	void power(){
//		power = true;
//		System.out.println("TV ON");
	}
	
}


//package e_oop;
//
//public class TV {
	
	/*
	 * 과제. 임의의 사물을 대상으로 클래스를 만들어주세요.
	 * 사물이 가지고 있는 속성을 변수로 만들고,
	 * 변수와 관계된 동작들을 메서드로 만들어주시면 됩니다.
	 */
	
	boolean power; //전원
	int channel; //채널
	int volume; //음량
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	TV(){
		power = false;
		channel = 1;
		volume = 5;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}
	
	void changeChannel(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;
			}
			System.out.println("채널. " + this.channel);
		}
	}
	
	void channelUp(){
		changeChannel(channel + 1);
	}
	
	void channelDown(){
		changeChannel(channel - 1);
	}
	
	void volumeUp(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
			showVolume();
		}
	}
	
	void volumeDown(){
		if(power){
			if(MIN_VOLUME < volume){
				volume--;
			}
			showVolume();
		}
	}
	
	void showVolume(){
		System.out.print("음량. ");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TV tv = new TV();
		
		while(true){
			System.out.println("-------------------------------");
			System.out.println("1.전원  2.채널변경  3.채널업  4.채널다운");
			System.out.println("5.볼륨업  6.볼륨다운  0.종료");
			System.out.println("-------------------------------");
			System.out.print("번호 입력>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1: tv.power(); break;
				
			case 2:
				System.out.print("변경할 채널 입력>");
				int ch = ScanUtil.nextInt();
				tv.changeChannel(ch);
				break;
				
			case 3: tv.channelUp(); break;
			case 4: tv.channelDown(); break;
			case 5: tv.volumeUp(); break;
			case 6: tv.volumeDown(); break;
				
			default:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}
	
}


