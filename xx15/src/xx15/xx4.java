package xx15;

class AA{
	public void doA() {
		int a= 10;
		System.out.println("a = "+a);
	}
}

class BB{
	public void ddd() {
		
	
	int b= 15;
	System.out.println("b = "+b);
	}
	
}


public class xx4 {

	public static void main(String[] args) {
		
		AA aa1 = new AA();		
	
		
		BB bb1 = new BB();
		aa1.doA();
		bb1.ddd();
	
		
		String a = "abc";
		String b = "abc";
		
		System.out.println(a==b);
		
		String c = "abc";
		String d = new String("abc");
		System.out.println(c==d);
		System.out.println();
		System.out.println(c.equals(d));
		
		// c==d는 거짓 이유는 스트링 d의 값이 문자열인 new string이기 때문 이럴 경우 equals를 넣으면 문자열 적용이 됨
		
	}
}

	


