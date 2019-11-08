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
	