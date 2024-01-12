package xx15;

public class xx3 {
	
	
	
	public static void main(String[] args) {
		
		float pi = 3.14159252352f;
		float shortPi = (int)(pi * 10000) / 10000f;
	System.out.println(shortPi);
	
	// math.round 반올림 함수
	// math random 0에서 1사이의 값 랜덤출력
	
	System.out.println(Math.random());
	
	double po = 3.51450;
	double shortPo = Math.round(po * 1000) / 1000.0;
	System.out.println(shortPo);
	
	}

}
