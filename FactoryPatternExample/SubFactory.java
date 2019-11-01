// SubFactory.java
class SubFactory extends Factory{
	// 获取一个减法运算的实例化对象
	public static Operation getOperation(){
		return new SubOperation();
	}
}
		