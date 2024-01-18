package ex11;

public class Ex05 {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1.toString());
		System.out.println(d1);

		Ex05 ex05 = new Ex05();
		
		Date d2 = ex05.copy(d1);

		System.out.println(d2);

		d2.x = 100;
		System.out.println(d1);

	}

	//static 
	Date copy(Date d) {
		Date date = new Date();
		return date;
	}
}

class Date {
	int x = 10;

	public String toString() {
		return "Date [x=" + x + "]";

	}

}
