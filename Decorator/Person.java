// Person.java
import java.lang.String;

// װ�ζ�����
class Person{
	private String name;  // ����
	
	public Person(){}
	public Person(String name){
		this.name = name;
	}
	// չʾװ�ν��
	public void show(){
		System.out.println("װ�ε�" + this.name);
	}
}