// DivFactory.java
class DivFactory extends Factory{
	// ��ȡһ�����������ʵ��������
	public static Operation getOperation(){
		return new DivOperation();
	}
}
		