// DivOperation.java
// �������������
class DivOperation implements Operation{
	// ����������
	public int getResult(int num1, int num2){
		if(num2==0){
			System.out.println("��������Ϊ0");
			return 0;
		}
		return num1/num2;
	}
}