package e_oop;

public class Radio {

	
boolean power; //전원
int channel; //주파수
int volume; //음량

final int MIN_CHANNEL1 = 1;
final int MAX_CHANNEL = 150;                     
final int MIN_VOLUME = 0;
final int MAX_VOLUME = 23;
	
Radio(){
	power = false;
	channel = 1;
	volume = 23;
}	
	
void power(){
	power = !power;
	System.out.println(power?"Radio on"
			: "Radio off");
}
	
void  changeChannel(int channel){
	if(power){
		if(MIN_CHANNEL1 <= channel && channel <= MAX_CHANNEL){
			this.channel = channel;
		}
		System.out.println("채널." + this.channel);
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
		System.out.print("음량");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
	
	System.out.println();	
	}	

   public static void main(String[]args){
	   Radio radio =new Radio();
	   
	   
	   while(true){
			System.out.println("----");
			System.out.println("1.전원  2.오디오 주파수 변경  3.오디오 주파수 업  4.오디오 주파수 다운");
			System.out.println("5.볼륨업  6.볼륨다운  0.전원끔");
			System.out.println("----");
			System.out.print("오디오 주파수 입력>");
			int input = ScanUtil.nextInt();
			
			
			switch (input) {
			case 1: radio.power(); break;
				
			case 2:
				System.out.print("변경할 주파수 입력>");
				int ch = ScanUtil.nextInt();
				radio.changeChannel(ch);
				break;
				
			case 3: radio.channelUp(); break;
			case 4: radio.channelDown(); break;
			case 5: radio.volumeUp(); break;
			case 6: radio.volumeDown(); break;
				
			default:
				System.out.println("오디오가 꺼졌습니다.");
				System.exit(0);
				break;
			}
		}
	}
	
}


