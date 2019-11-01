// DivFactory.java
class DivFactory extends Factory{
	// 获取一个除法运算的实例化对象
	public static Operation getOperation(){
		return new DivOperation();
	}
}
		