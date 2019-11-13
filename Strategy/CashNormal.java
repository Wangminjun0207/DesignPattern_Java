// CashNormal.java
// 超市正常收费算法类
class CashNormal extends Strategy{
	// 打折算法
	public double acceptCash(double money){
		return money;
	}
}