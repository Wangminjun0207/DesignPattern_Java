# 装饰模式
装饰模式又被称为包装模式。装饰模式动态的给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更加灵活，主要就是继承关系的一个替换。
##### 1.代码实现
装饰模式举的例子就是人在穿衣服的过程，肯定是有先后顺序，如果不当的穿衣顺序可能会闹了笑话。装饰模式特别的形象，如果不使用装饰模式，可能会在客户端穿一件衣服展示一下，最后也会完成这个穿衣服的过程，但是实际情况不是这样的，不可能穿一件衣服让别人看一下，而是完完全全穿好才给别人看，装饰模式也正是这样的：客户端多次装饰，展示一次，就可以看到装饰好的效果。来看代码，Person类是装饰对象，Finery是服装类，而其他的就是具体的服饰类，每个服饰类都可完成对装饰对象的一次装饰。由于上半身和下半身的装饰原理一样（懒），就只装饰上半身。
```java
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
// Finery.java
class Finery extends Person{
	private Person person;
	
	// 装饰方法
	public void Decorate(Person component){
		this.person = component;
	}
	// 展示装饰结果
	public void show(){
		if(person != null){
			person.show();
		}
	}
}
// BigTrouser.java
// BigTrouser类，用BigTrouser装饰person
class BigTrouser extends Finery{
	// 展示装饰结果
	public void show(){
		System.out.print("BigTrouser  ");
		super.show();
	}
}
、// Suit.java
// Suit类，用Suit装饰person
class Suit extends Finery{
	// 展示装饰结果
	public void show(){
		System.out.print("Suit  ");
		super.show();
	}
}
// Tie.java
// Tie类，用Tie装饰person
class Tie extends Finery{
	// 展示装饰结果
	public void show(){
		System.out.print("Tie  ");
		super.show();
	}
}
// TShirts.java
// TShirts类，用TShirts装饰person
class TShirts extends Finery{
	// 展示装饰结果
	public void show(){
		System.out.print("TShirts  ");
		super.show();
	}
}
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
```
>从客户端代码可以看出，先用BigTrouser装饰人，然后用Tie装饰被BigTrouser装饰过的人，最后用Suit装饰先后被BigTrouser和Tie装饰过的人。合乎情理，先给人穿衬衣，打领带，再穿西服。来看测试结果：

![在这里插入图片描述](https://img-blog.csdnimg.cn/2019111020103045.png)

>如果改动装饰的顺序，可能会闹了笑话，就是领带打在了西服上，上面还穿了衬衣，来看客户端代码和结果：
```java
// MainClass.java
public class MainClass{
	public static void main(String []args){
		Person person = new Person("xxx");
		Suit suit = new Suit();
		BigTrouser bigt = new BigTrouser();
		Tie tie = new Tie();
		TShirts tshirts = new TShirts();
		/* bigt.Decorate(person);
		tie.Decorate(bigt);
		suit.Decorate(tie);
		suit.show(); */
		suit.Decorate(person);
		tie.Decorate(suit);
		tshirts.Decorate(tie);
		tshirts.show();
	}
}
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191110201444349.png)
##### 2.装饰模式的角色和职责
* 抽象组件角色：一个抽象接口，是被装饰类和装饰类的父接口。
* 具体组件角色：为抽象组件的实现类。
* 抽象装饰角色：包含一个组件的引用，并定义了与抽象组件一致的接口。
* 具体装饰角色：为抽象装饰角色的实现类，负责具体的装饰。