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