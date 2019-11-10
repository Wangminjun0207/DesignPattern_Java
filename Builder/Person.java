// Person.java
import java.lang.String;
// 人体型对象类，包括体型的一些基本属性
class Person{
	private String head;   // 头部
	private String body;   // 身躯
	private String weight; // 体重
	
	// 设置头部
	public void setHead(String head){
		this.head = head;
	}
	// 设置身躯
	public void setBody(String body){
		this.body = body;
	}
	// 设置体重
	public void setWeight(String weight){
		this.weight = weight;
	}
	// 描述体型的方法
	public void show(){
		System.out.println("head  :" + this.head);
		System.out.println("body  :" + this.body);
		System.out.println("weight:" + this.weight);
	}
}