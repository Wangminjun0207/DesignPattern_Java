# 单例模式
单例模式是一种对象创建型模式，使用单例模式，可以保证为一个类只生成唯一的一个对象。也就是说，在整个程序空间中，改类只存在一个实例对象。
##### 1.饿汉式单例模式
* 私有化构造器
* 在类的内部创建一个类的实例,且为static
* 私有化对象,通过公共方法调用
* 此公共方法只能通过类来调用,因为设置的是static,同时类的实例也是static
>由“饿汉式”得知，因为比较饥饿，所以先将对象实例化，在设置全局静态函数获取这个对象。不需要考虑线程安全，因为在类的加载过程就创建了对象，之后不再创建。代码如下：
```java
// SingletonHungry.java
import java.lang.String;
class SingletonHungry{
	private String Info = "饿汉式单例模式";
	// 常量实例化对象
	private static final SingletonHungry singleton = new SingletonHungry();
	// 私有构造函数，保证只有一个实例化对象
	private SingletonHungry(){}
	// 返回唯一实例化对象函数
	public static SingletonHungry getInstance(){
		return singleton;
	}
	// 返回对象信息
	public String getInfo(){
		return Info;
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []args){
		// 获取第一个实例化对象
		SingletonHungry hungry1 = SingletonHungry.getInstance();
		System.out.println(hungry1.getInfo());
		
		// 获取第二个实例化对象
		SingletonHungry hungry2 = SingletonHungry.getInstance();
		System.out.println(hungry2.getInfo());
		
		// 比较两个对象是否是同一个
		if(hungry1==hungry2){
			System.out.println("两个对象是同一个实例化对象");
		}
	}
}
```
##### 2.懒汉式单例模式
* 私有化构造器

* 创建一个私有的实例static 先不实例化 为 null

* 通过公共方法调用 static 在方法里面进行判断,if = null，实例化； !=null 直接return
>“懒汉式”，顾名思义那就是懒惰，是在需要实例化对象的时候创建，而且只创建一次，之后返回第一次创建的实例化对象。但是在“懒汉式”单例模式中要考虑线程安全，为了程序运行效率只同步创建实例化的语句，但是要进行双重检查。代码如下：
```java
// SingletonSluggard.java
import java.lang.String;
class SingletonSluggard{
	private String Info;
	// 常量实例化对象
	private static SingletonSluggard singleton = null;
	// 私有构造函数，保证只有一个实例化对象
	private SingletonSluggard(){}
	// 返回唯一实例化对象函数
	public static SingletonSluggard getInstance(){
		// 防止多线程不同步产生多个实例化对象
		if(singleton==null){
			synchronized(SingletonSluggard.class){
				
				if(singleton==null){
					singleton = new SingletonSluggard();
					singleton.Info = "懒汉式单例模式";
				}
			}
		}
		return singleton;
	}
	// 返回对象信息
	public String getInfo(){
		return Info;
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []args){
		// 获取第一个实例化对象
		SingletonSluggard sluggard1 = SingletonSluggard.getInstance();
		System.out.println(sluggard1.getInfo());
		
		// 获取第二个实例化对象
		SingletonSluggard sluggard2 = SingletonSluggard.getInstance();
		System.out.println(sluggard2.getInfo());
		
		// 比较两个对象是否是同一个
		if(sluggard1==sluggard2){
			System.out.println("两个对象是同一个实例化对象");
		}
	}
}
```