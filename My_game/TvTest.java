package My_game;

public class TvTest {

	public static void main(String[] args) {

		
		Tv t = new Tv();
		
//		System.out.println("1.test: " + t.test);
		System.out.println("변경전 channel: " + t.channel);
		System.out.println("변경전 power:" + t.channel);
		System.out.println("변경전 color: " + t.channel);
		
		
		t.channel= 15;
		
		System.out.println("변경후: " + t.channel);
		
		Tv t2 = new Tv();
		t2.channel = 100;
//		System.out.println("2.test = " + t.test);
		t.channelUp();
		System.out.println("up호출후:" + t.channel);
	}

}
