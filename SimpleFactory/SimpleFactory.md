# 简单工厂模式

&ensp;&ensp;&ensp;&ensp;简单工厂模式属于类的创建型模式，又叫做静态工厂方法模式。通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。 
##### 1.Java代码实现
>第一版：没有类实例创建的工厂，每个类的对象实例化需在主函数实现，使得主函数代码很长，不容易维护，不容易扩展。代码如下：
```Java
// Apple.java
class Apple{
	public void get()
	{
		System.out.println("get Apple");
	}
}
// Banana.java
class Banana{
	public void get()
	{
		System.out.println("get Banana");
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []srgs){
		// 实例化一个Apple对象
		Apple apple = new Apple();
		// 实例化一个Banana对象
		Banana banana = new Banana();
		apple.get();
		banana.get();
	}
}
```
>第二版：定义Fruit接口，在类Apple和Banana中实现get()方法。这样在实例化Apple和Banana类对象的时候可以用到多态，向上转型。但是很遗憾的是，目前还是没有用到工厂。代码如下：
```Java
// Fruit.java
/* 定义一个接口，里面有get方法，被继承的时候实现 */
interface Fruit{
	public void get();
}
// Apple.java
class Apple implements Fruit{
	public void get()
	{
		System.out.println("get Apple");
	}
}
// Banana.java
class Banana implements Fruit{
	public void get()
	{
		System.out.println("get Banana");
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []srgs){
		// 实例化一个Apple对象
		// Apple apple = new Apple();
		Fruit apple = new Apple();  // 使用到了多态
		// 实例化一个Banana对象
		// Banana banana = new Banana();
		Fruit banana = new Banana();// 使用到了多态
		apple.get(); 
		banana.get();
	}
}
```
>第三版：定义类SimpleFactory，这里将会通过类的静态成员函数来完成其他具有相同父类的类的对象实例化工作，这也正是工厂模式的意义所在。但是仍然不完美，还要在后面的版本中逐渐升级，所谓循序渐进。代码如下：
```Java
// Fruit.java
/* 定义一个接口，里面有get方法，被继承的时候实现 */
interface Fruit{
	public void get();
}
// Apple.java
class Apple implements Fruit{
	public void get()
	{
		System.out.println("get Apple");
	}
}
// Banana.java
class Banana implements Fruit{
	public void get()
	{
		System.out.println("get Banana");
	}
}
// SimpleFactory.java
public class SimpleFactory{
	// 获得Apple的实例化
	public static Fruit getApple(){
		// 这里使用静态函数，方便用类名直接调用
		return new Apple();
	}
	
	// 获得Banana的实例化
	public static Fruit getBanana(){
		// 这里使用静态函数，方便用类名直接调用
		return new Banana();
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []srgs){
		// 实例化一个Apple对象
		// Apple apple = new Apple();
		//Fruit apple = new Apple();  // 使用到了多态
		Fruit apple = SimpleFactory.getApple();
		// 实例化一个Banana对象
		// Banana banana = new Banana();
		//Fruit banana = new Banana();// 使用到了多态
		Fruit banana = SimpleFactory.getBanana();
		apple.get(); 
		banana.get();
	}
}
```
>第四版：在第三版中其实是通过调用工厂的不同函数来实例化Apple和Banana的对象，这样做觉得工厂的员工职责太过于专一，如果有员工一天没有自己要干的活，难道就要一整天等待吗？显然这样是不对的，应该让一个员工可以干多种活，那么第四个版本就应用而生。而且在这个版本中，工厂的员工还是比较聪明的，比如说你找Jack，但是你说你找jack,他也是可以帮你找到Jack的。代码如下：
```Java
// Fruit.java
/* 定义一个接口，里面有get方法，被继承的时候实现 */
interface Fruit{
	public void get();
}
// Apple.java
class Apple implements Fruit{
	public void get()
	{
		System.out.println("get Apple");
	}
}
// Banana.java
class Banana implements Fruit{
	public void get()
	{
		System.out.println("get Banana");
	}
}// SimpleFactory.java
public class SimpleFactory{
	/* // 获得Apple的实例化
	public static Fruit getApple(){
		// 这里使用静态函数，方便用类名直接调用
		return new Apple();
	}
	
	// 获得Banana的实例化
	public static Fruit getBanana(){
		// 这里使用静态函数，方便用类名直接调用
		return new Banana();
	} */
	// get方法，获得所有对象
	public static Fruit get(String type)
	{
		// 判断传来的字符串的值，获得相应对象
		if(type.equalsIgnoreCase("Apple")){
			return new Apple();
		}else if(type.equalsIgnoreCase("Banana")){
			return new Banana();
		}else{
			return null;
		}
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []srgs){
		// 实例化一个Apple对象
		// Apple apple = new Apple();
		//Fruit apple = new Apple();  // 使用到了多态
		Fruit apple = SimpleFactory.get("Apple");
		// 实例化一个Banana对象
		// Banana banana = new Banana();
		//Fruit banana = new Banana();// 使用到了多态
		Fruit banana = SimpleFactory.get("banana"); // 在这里将Banana故意改成banana
		apple.get(); 
		banana.get();
	}
}
```
>第五版：本来是想在第四版的基础之上再来个第五版，但是第五版我还是没怎么看懂，而且对于程序员来说可能更好，在添加一个新类的时候不需要在去改动工厂的函数，就像是不再去培训员工一样。来多少个活这个员工都会干，但是干的非常死板，Jack就是Jack，你找jack是不可能找到的，这样的员工我们还是要慎重使用，所以对员工定期培训还是来的比较靠谱。那么就没有代码了，这个版本也是被我杀死在了萌芽阶段。
##### 2.模式中包含的角色及其职责
* 工厂（Creator）角色
简单工厂模式核心，它负责实现创建所有实例内部逻辑。工厂类可以被外界直接调用，创建所需的产品对象。
* 抽象（Product）角色
简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公有接口。
* 具体产品（Concrete Product）角色
简单工厂模式创建的具体实例对象。
##### 3.简单工厂模式的优缺点
* 优点： 在这个模式中，工厂类是整个模式的核心。它包含必要的判断逻辑，能够根据外界给定的信息，决定生产哪个类的实例对象。用户在使用的时候根据工厂类创建所需要的实例，而无需了解这些对象是如何创建及组织的。有利整个软件系统的优化。
* 缺点：不难发现，简单工厂模式的缺点也正是体现在工厂类上，由于工厂类集中了所有实例的创建逻辑，所以“高内聚”方面做得并不好。另外，当系统中的具体产品类不断增加的时候，可能会出现工厂类也要做出改变，扩并不好。