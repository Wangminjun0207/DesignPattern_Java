// MulFactory.java
class MulFactory extends Factory{
	// 获取一个乘法运算的实例化对象
	public static Operation getOperation(){
		return new MulOperation();
	}
}
		