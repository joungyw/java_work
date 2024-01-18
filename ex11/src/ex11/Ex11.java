package ex11;

public class Ex11 {
	public static void main(String[] arge) {
		hiEverOne("홍길동",12,"남자");
		
//		Person p1 = new Person("이길동",null,"남자",null,20);
		
		final int A = 10;
		
//		p1.initValue("이길동",20, "여자");
			
		}
	static void hiEverOne(Person p) {
		System.out.println("안녕하세요 "+ p.name +"님");
		System.out.println("저는 " + p.age +"세 입니다.");
		System.out.println("성별은 "+ p.gender+"입니다.");
		
}
		
		static void hiEverOne(String name, int age, String gender) {
			System.out.println("안녕하세요 "+name+"님");
			System.out.println("저는 " + age+"세 입니다.");
			System.out.println("성별은 "+gender+"입니다.");
		
	}

}
