// CashRebate.java

// 超市打折收费算法类
class CashRebate extends Strategy{
	// 打折算法
	public double acceptCash(double money){
		return 0.8 * money;  // 打八折
	}
}