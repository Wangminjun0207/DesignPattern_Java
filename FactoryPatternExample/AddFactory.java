// AddFactory.java
class AddFactory extends Factory{
	// 获取一个加法运算的实例化对象
	public static Operation getOperation(){
		return new AddOperation();
	}
}
		