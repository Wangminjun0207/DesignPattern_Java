// AddFactory.java
class AddFactory extends Factory{
	// ��ȡһ���ӷ������ʵ��������
	public static Operation getOperation(){
		return new AddOperation();
	}
}
		