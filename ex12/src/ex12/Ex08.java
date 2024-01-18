package ex12;

class Point{
	int xpos,ypos;

	public Point(int xpos, int ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}
	
	public void shoePointInfo() {
		System.out.println("[ xpos = "+xpos + " ] "
				+ "[ ypos = "+ypos+" ]");
	}
	

class Circle{
Point p;
int rad;
Circle(Point p, int rad) {
		this.p= p;
		this.rad = rad;
}
	public void shoePointInfo() {
		p.shoePointInfo();
		System.out.println("[ rad = "+rad+" ]");
	}
}

public class Ex08 {
	
	public static void main(String[] args) {
		
		Point p1 = new Point(5, 10);
		p1.shoePointInfo();
		
//		Circle c = new Circle(p1,5);
//		c.shoePointInfo();
		
		int d = 20;
		Point p3 = new Point(10,2);
		
//		Circle cte = new Circle(p3, d);
	}

}
}


