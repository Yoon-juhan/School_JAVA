public class Television {
	
	private int channel;
	private int volume;
	private boolean onOff;
	
	void print(String p) {
		System.out.printf("%s의  채널: %d,  볼륨: %d\n",p ,channel, volume);
	}
	void channelUp() {
		channel ++;
		System.out.printf("현재 텔레비전의 채널: %d\n", channel);
	}
	void channelDown() {
		channel --;
		System.out.printf("현재 텔레비전의 채널: %d\n", channel);
	}
	void volumeUp() {
		volume ++;
		System.out.printf("현재 텔레비전의 음량: %d\n", volume);
	}
	void volumeDown() {
		volume --;
		System.out.printf("현재 텔레비전의 음량: %d\n", volume);
	}
	int getChannel() {
		return channel;
	}
	int getVolume() {
		return volume;
	}
	void setChannel(int ch) {
		channel = ch;
	}
	void setVolume(int vo) {
		volume = vo;
	}
}








