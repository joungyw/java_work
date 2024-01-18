package ex10;

public class TV {
	public String color;
	public boolean power;
	public int channel;

	TV() {
	};

	public void power() {
		System.out.println("power 버튼 누름");
		power = !power;
	}

	public void channelUp() {
		System.out.println("채널 올리기");
		channel++;
	}

	public void channelDown() {
		System.out.println("채널 내리기");
		channel--;
		if (channel == -1) {
			System.out.println("채널이 음수라서 0으로 초기화함");
			channel = 0;
		}
	}

}
