// CashRebate.java

// ���д����շ��㷨��
class CashRebate extends Strategy{
	// �����㷨
	public double acceptCash(double money){
		return 0.8 * money;  // �����
	}
}