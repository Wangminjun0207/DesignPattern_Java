// CashContext.java
// 策略类
class CashContext{
	private Strategy strategy; /// 具体的决策对象
	// 构造函数
	CashContext(Strategy strategy){
		this.strategy = strategy;
	}
	// 给客户端的决策接口
	// 根据具体的决策对象，调用其算法的方法
	public double finalMoney(double money){
		return strategy.acceptCash(money);
	}
}