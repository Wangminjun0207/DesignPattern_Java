// MainClass.java
public class MainClass{
	public static void main(String []srgs){
		// ʵ����һ��Apple����
		// Apple apple = new Apple();
		//Fruit apple = new Apple();  // ʹ�õ��˶�̬
		Fruit apple = SimpleFactory.get("Apple");
		// ʵ����һ��Banana����
		// Banana banana = new Banana();
		//Fruit banana = new Banana();// ʹ�õ��˶�̬
		Fruit banana = SimpleFactory.get("banana"); // �����ｫBanana����ĳ�banana
		apple.get(); 
		banana.get();
	}
}