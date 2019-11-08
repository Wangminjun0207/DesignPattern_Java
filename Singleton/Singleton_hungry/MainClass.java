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