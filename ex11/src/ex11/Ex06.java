package ex11;

class MyClass {

	@Override
	public String toString() {
		return "MyClass ";
	}
}

public class Ex06 {

	static int doA() {
		return 10;
	}

	static MyClass doClass() {
		MyClass mc = new MyClass();
		return mc;
	}

	public static void main(String[] arge) {
		MyClass mc = doClass();
		System.out.println(mc);

	}
}
