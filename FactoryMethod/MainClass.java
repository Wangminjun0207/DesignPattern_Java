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