package ex10;

class Date{
	int x = 10;
	int y = 20;
	
	void chagePri(int x) {
		x = 200;
	}
	void chageRef(Date di) {
		di.x = 200;
	}
}
public class Ex11 {
	
	Ex11(){
		Date d1 = new Date();
		d1.x = 100;
		System.out.println(d1.x);
		
		d1.chagePri(d1.x);
		System.out.println(d1.x);
		
		d1.chageRef(d1);
		System.out.println(d1.x);
	}
	
	public static void main(String[] args) {
		new Ex11();		
	}
}
