// Person.java
import java.lang.String;

// 装饰对象类
class Person{
	private String name;  // 名字
	
	public Person(){}
	public Person(String name){
		this.name = name;
	}
	// 展示装饰结果
	public void show(){
		System.out.println("装饰的" + this.name);
	}
}