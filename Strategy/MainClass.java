// MainClass.java
// �ͻ���
public class MainClass{
	public static void main(String args[]){
		// �����շ�
		CashNormal normal = new CashNormal();
		CashContext context = new CashContext(normal);
		System.out.println("�����շ�"+context.finalMoney(100));
		
		// �����շ�
		CashRebate rebate = new CashRebate();
		CashContext context1 = new CashContext(rebate);
		System.out.println("�����շ�"+context1.finalMoney(100));
	}
}