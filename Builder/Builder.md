# 建造者模式
建造者模式是一种对象创建型模式之一，用来隐藏复合对象的创建过程，它把复合对象的创建过程，通过子类继承和重载的方法，动态的创建具有复合属性的对象。
##### 1.代码实现
这里还是拿程杰的《大话设计模式》一书中让小菜画不同外貌特征的小人为例，叙述整个建造者模式的实现过程。为了不丢三落四，小人的创建统一让设计师（Director）来指挥工程队（PersonBuilder）完成，客户只是给设计师说具体的要求就可以，不至于像小菜一样画个人还没了胳膊。而且构造不同特征小人的工程队是继承自一个抽象工程队，并且具体工程队能够返回创建的产品对象。具体还是来看示例代码：
```java
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
// PersonBuilder.java
// 创建人体型的抽象类
abstract class PersonBuilder{
	public abstract void BuildHead();  // 建造头部
	public abstract void BuildBody();  // 建造身躯
	public abstract void BuildWeight();// 建造体重
}
// PersonFatBuilder.java
// 肥胖小人的建造者类
class PersonFatBuilder extends PersonBuilder{
	Person person = new Person();
	
	public void BuildHead(){
		person.setHead("头大");
	}
	public void BuildBody(){
		person.setBody("腰圆");
	}
	public void BuildWeight(){
		person.setWeight("300KG");
	}
	// 返回建造的肥胖小人
	public Person getPerson(){
		return person;
	}
}
// PersonThinBuilder.java
// 瘦弱小人的建造者类
class PersonThinBuilder extends PersonBuilder{
	Person person = new Person();
	
	public void BuildHead(){
		person.setHead("细长");
	}
	public void BuildBody(){
		person.setBody("经不起风吹");
	}
	public void BuildWeight(){
		person.setWeight("30KG");
	}
	// 返回建造的瘦弱小人
	public Person getPerson(){
		return person;
	}
}
// PersonDirector.java
// 构造小人的指挥者类
class PersonDirector{
	// 构造一个客户端指定的小人
	public void makePerson(PersonBuilder builder){
		builder.BuildHead(); 
        builder.BuildBody(); 
        builder.BuildWeight();
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []args){
		// 构造一个瘦弱的小人
		PersonThinBuilder builder1 = new PersonThinBuilder();
		// 设计者来实现小人的完整构造
		PersonDirector director = new PersonDirector();
		director.makePerson(builder1);
		Person person1 = builder1.getPerson();
		// 描述瘦弱小人的特征
		person1.show();
		
		// 构造一个肥胖的小人
		PersonFatBuilder builder2 = new PersonFatBuilder();
		// 设计者来实现小人的完整构造
		director.makePerson(builder2);
		Person person2 = builder2.getPerson();
		// 描述肥胖小人的特征
		person2.show();
	}
}
```
##### 2.适用场景
所以说，建造者模式是在当创建复杂对象的算法应该独立于该对象的组成部分以及他们的装配方式时适用的模式。