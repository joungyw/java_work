package ex11;

public class Person {
	
	String name;
	String phone;
	String gender;
	String remark;
	 int age;
	
	public Person() {
	}
	
	
	//name , phone , gender , remark 설정하는 메서드
	public void setPerson(String name, String phone, String gender, String remark, int age) { 
		
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.remark = remark;
		this.age = age;
		
	}
	public void initValue(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + 
				", phone=" + phone + ", gender=" 
				+ gender + ", remark=" + remark + "]";
		
		
		
		
	}

}