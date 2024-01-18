package ex12;

public class Tri {
		int width;
		int height;
		
		public Tri() {}
		// alt + shift + s -> o 다른생성자 기본생성자 생략불가
		public Tri(int width, int height) {
			super();
			this.width = width;
			this.height = height;
		}
		// alt + shift + s -> s 
		@Override
		public String toString() {
			return "Tri [width = " + width + ", height = " + height + "]";
		}
		public double area() {
			return width*height*0.5;
		}
		
	}


