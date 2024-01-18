package ex11;

public class Ex10 {
	public static void main(String[] args) {
		
		int resuit = fact(5);
		
		System.out.println(resuit);
		
	}
	public static int fact(int num) {
		if(num>0)
			return num*fact(num-1);
		else
			return 1;
	}

}
