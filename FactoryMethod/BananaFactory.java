// BananaFactory.java
class BananaFactory extends FruitFactory{
	// 静态成员函数，返回一个Banana实例对象
	public static Fruit getFruit(){
		return new Banana();
	}
}