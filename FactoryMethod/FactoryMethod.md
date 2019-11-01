# 工厂方法模式
工厂方法模式同样属于类的创建型模式，又被称为多态工厂模式。工厂方法模式的意义是定义一个创建产品对象的接口，将实际创建工作推迟到子类当中。核心工厂类不再负责产品的创建，这样核心类成为一个抽象工厂角色，仅负责具体工厂子类必须实现的接口，这样进一步才抽象化的好处是使得工厂方法模式可以使系统在不修改具体工厂角色的情况下引进新的产品，后面对工厂方法模式和简单工厂模式也有比较。
##### 1.代码实现
>第一版：首先把核心工厂类抽象出来，创建实例化产品对象的接口，等着子类去实现。这就像一个公司的领导，知道要干什么，但是并不是真正的去干，而是让底下的员工去具体的干这件事情。添加产品类和工厂类以及测试的代码如下：
```Java
// FruitFactory.java
abstract class FruitFactory{
	// 抽象类成员，在子类中实现，返回一个实例化对象
	public static Fruit getFruit(){
		return null;
	}
}
// AppleFactory.java
class AppleFactory extends FruitFactory{
	// 静态成员函数，返回一个Apple实例对象
	public static Fruit getFruit(){
		return new Apple();
	}
}
// BananaFactory.java
class BananaFactory extends FruitFactory{
	// 静态成员函数，返回一个Banana实例对象
	public static Fruit getFruit(){
		return new Banana();
	}
}
// Fruit.java
interface Fruit{
	// 进行水果采摘，子类实现
	public void get();
}
// Apple.java
class Apple implements Fruit{
	public void get(){
		System.out.println("采集苹果");
	}
}
// Banana.java
class Banana implements Fruit{
	public void get(){
		System.out.println("采集香蕉");
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []args){
		// 创建一个Apple实例对象，调用工厂生产
		Fruit apple = AppleFactory.getFruit();
		// 创建一个Banana实例对象，调用工厂生产
		Fruit banana = BananaFactory.getFruit();
		apple.get();
		banana.get();
	}
}
```
>第二版：如果这时候又有新产品需要公司生产，那难道要换领导吗？看来是行不通的，那么我想到的办法就是找个干这份工作的新员工，相对于换领导来的更加实际，并且更加的合理。在程序中对应的就是不去改核心工厂类，而是再添加一个子工厂类和一个产品类。代码如下：
```Java
// PearFactory.java
class PearFactory extends FruitFactory{
	// 静态成员函数，返回一个Apple实例对象
	public static Fruit getFruit(){
		return new Pear();
	}
}
// Banana.java
class Pear implements Fruit{
	public void get(){
		System.out.println("采集梨子");
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []args){
		// 创建一个Apple实例对象，调用工厂生产
		Fruit apple = AppleFactory.getFruit();
		// 创建一个Banana实例对象，调用工厂生产
		Fruit banana = BananaFactory.getFruit();
		// 创建一个Pear实例对象，调用工厂生产
		Fruit pear = PearFactory.getFruit();
		apple.get();
		banana.get();
		pear.get();
	}
}
```
##### 2.模式中包含的角色及其职责
* 抽象工厂（Creator）角色
工厂方法模式的核心，任何工厂类都必须实现这个接口。
* 具体工厂（Concrete Creator）角色
具体工厂类是抽象工厂的一个实现，负责实例产品对象。
* 抽象（Product）角色
工厂方法模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
* 具体产品（Concrete Product）角色
工厂方法模式所创建的具体的实例对象。
##### 3.工厂方法模式和简单工厂模式比较
* 工厂方法模式与简单工厂模式在结构上的不同不是很明显。工厂方法类的核心是抽象一个工厂类，而简单工厂模式是把核心类放到一个具体类上。
* 工厂方法模式之所以有一个别名叫多态工厂模式是因为具体工厂类都有共同的抽象父类，或者有共同的接口。
* 当系统需要添加新的产品对象的时候，仅仅需要添加一个具体对象以及具体工厂类，原有的工厂对象不需要进行任何的修改，很好的符合了“开放——封闭”原则。而简单工厂模式在添加新产品对象后不得不修改工厂方法，扩展性不好。
* 工厂方法模式退化后可以演变成简单工厂模式。