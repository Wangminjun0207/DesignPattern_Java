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
	