// MulFactory.java
class MulFactory extends Factory{
	// ��ȡһ���˷������ʵ��������
	public static Operation getOperation(){
		return new MulOperation();
	}
}
		