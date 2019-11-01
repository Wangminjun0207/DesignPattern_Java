// PearFactory.java
class PearFactory extends FruitFactory{
	// 静态成员函数，返回一个Apple实例对象
	public static Fruit getFruit(){
		return new Pear();
	}
}