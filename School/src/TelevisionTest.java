import java.util.*;

public class TelevisionTest {

	public static void main(String[] args) {
		
		Television myTv = new Television(); // 객체 생성
		Television yourTv = new Television(); // 객체 생성
		
//		myTv.channel = 10;
//		myTv.volume = 5;
//		myTv.onOff = true;
		myTv.print("myTv");
		myTv.setChannel(50);
		myTv.setVolume(10);
		myTv.print("myTv");
		
//		int ch = myTv.getChannel();
//		System.out.println("현재 채널: " + ch);
		
		System.out.println(Math.addExact(3, 5));
	
	}
}