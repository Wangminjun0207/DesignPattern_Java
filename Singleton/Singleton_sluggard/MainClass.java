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