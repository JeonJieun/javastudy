package tv;

/* void power( boolean on ) 메소드 구현
 void channel( int channel ) 메소드 구현 (1~255 유지) 
 void channel( boolean up ) 메소드 오버로딩 (1~255 유지, 1씩 증감)
 void volume( int volume ) 메소드 구현  ( 0 ~ 100 유지 )
 void volume( boolean up ) 메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
 void status() 메소드 구현( TV 정보 출력) 
*/

public class TV {
	private int channel; // 1~255 //디지털 아날로그
	private int volume; // 0~ 100 power 없으면 작동 x channel = volume % 255 //디지털 아날로그
	private boolean power;

	TV(int channel, int volume, boolean power) {
		setChannel(channel);
		setVolume(volume);
		setPower(power);
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		channel = (channel%255);
		if(channel==0) { this.channel = 255; }
		else this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume<0) { this.volume = 0; }
		else if(volume>100) { this.volume = 100; }
		else { this.volume = volume; }
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void power(boolean state) { //true : ON, false : OFF
		setPower(state);
	}

	public void channel(int number) { //숫자 입력 1~255
		if(isPower()) {
			if(number>=1 && number<=255) { setChannel(number); }
			else {System.out.println("없는 채널입니다.");}
		}
	}

	public void channel(boolean state) { //true +1, false -1
		if(isPower()) {
			if(state){ setChannel(getChannel()+1); }
			else { setChannel(getChannel()-1); }
		}

	}

	public void volume(int number) { //숫자 입력 1~100
		if(isPower()) {
			setVolume(number);
		}
	}

	public void volume(boolean state) {
		if(isPower()) {
			if(state){ setVolume(getVolume()+1); }
			else { setVolume(getVolume()-1); }
		}
	}

	public void status() { //상태 출력
		String str;
		if(isPower()) str = "ON";
		else str = "OFF";
		System.out.println("TV [power=" + str + ", channel=" + channel + ", volume=" + volume +"]");
	}

}
