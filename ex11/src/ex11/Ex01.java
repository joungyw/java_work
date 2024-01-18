package ex11;

public class Ex01 {
	
	
	public static void main(String[] args) {
		
		Person[] p = new Person[10];
		
		 p[0] = new Person();
		 p[0].name = "홍길동";
		 
		 p[0].setPerson(null, null, null, null, 0);
		 
		 
		 
		 
		 System.out.println(p[0]);
		 System.out.println(p[1]);
		 System.out.println(p[2]);
		
		
	}
}
