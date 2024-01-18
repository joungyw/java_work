package ex12;

public class Circle {

	// 다른 클래스에서는 참조 불가
	private int rad;

	final double PI = 3.14;

	public Circle() {
	}

	public Circle(int rad) {
		this.rad = rad;
	}

	public void setRad(int r) {
		if(r<0)
		{this.rad = 10; return;}
		this.rad = r;
	}

	public double getArea() {
		return rad * rad * PI;

	}

}
