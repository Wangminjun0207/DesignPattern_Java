# 策略模式
它定义了算法家族，分贝封装起来，让它们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户端。这是程杰在《大话设计模式》里面对策略模式的简单定义。
##### 1.策略模式实现
策略模式在生活中用的最多的地方大概就是打折，打折用的最多的地方大概就是超市。好了，来模拟一下超市使用不同方案打折的收费结果。为了说明这个模式的用法，简单的举了两个打折方案：一是正常收费（很sb）；二是在总额的基础上打八折。在这里抽象出一个Strategy类，主要是一个收费方案的抽象方法，在子类中实现。CashContext类主要就是来完成决策，客户端给一个具体的决策对象，至于使用哪个方案来收取金额，还是要在这个类中进行决策。来看代码：
```java
// Strategy.java
// 超市打折的抽象算法类
abstract class Strategy{
	// 打折算法
	public abstract double acceptCash(double money);
}
// CashNormal.java
// 超市正常收费算法类
class CashNormal extends Strategy{
	// 打折算法
	public double acceptCash(double money){
		return money;
	}
}
// CashRebate.java
// 超市打折收费算法类
class CashRebate extends Strategy{
	// 打折算法
	public double acceptCash(double money){
		return 0.8 * money;  // 打八折
	}
}
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
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191113225758831.png)
>没用一个输入输出，主要还是为了说明用法，直接给出参数，就不必要写太多无用的废话，达到验证决策模式的正确性即可。运行结果也是和我预计的一样，100元正常收费就是100，打八折就是80元。
##### 2.决策模式类图
* Context上下文，用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
* ConcreteStrategyA、ConcreteStrategyB、ConcreteStrategyC是具体的策略类，封装了具体的算法或者行为，继承与Strategy
* Strategy是策略类，定义所有支持的算法的接口
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191113230048302.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mjc5NTE0MQ==,size_16,color_FFFFFF,t_70)