// SubFactory.java
class SubFactory extends Factory{
	// ��ȡһ�����������ʵ��������
	public static Operation getOperation(){
		return new SubOperation();
	}
}
		