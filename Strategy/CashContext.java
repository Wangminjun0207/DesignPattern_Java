// CashContext.java
// ������
class CashContext{
	private Strategy strategy; /// ����ľ��߶���
	// ���캯��
	CashContext(Strategy strategy){
		this.strategy = strategy;
	}
	// ���ͻ��˵ľ��߽ӿ�
	// ���ݾ���ľ��߶��󣬵������㷨�ķ���
	public double finalMoney(double money){
		return strategy.acceptCash(money);
	}
}