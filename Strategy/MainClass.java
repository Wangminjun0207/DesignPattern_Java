// MainClass.java
// 客户端
public class MainClass{
	public static void main(String args[]){
		// 正常收费
		CashNormal normal = new CashNormal();
		CashContext context = new CashContext(normal);
		System.out.println("正常收费"+context.finalMoney(100));
		
		// 打折收费
		CashRebate rebate = new CashRebate();
		CashContext context1 = new CashContext(rebate);
		System.out.println("打折收费"+context1.finalMoney(100));
	}
}