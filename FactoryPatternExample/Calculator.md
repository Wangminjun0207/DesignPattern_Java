# 工厂模式写简单计算器
学了三个工厂模式，各有各的长处，我选择了工厂方法模式做了一个练习。做了一个计算器，当然这个计算器省略了很多客户端的代码，只是为了表达出工厂模式的应用即可，直接看代码。这个例子也是程杰老师在《大话设计模式》里面有讲到过，可能没有学习设计模式之前我也会和程老师带的菜鸟一样写出书中的第一个版本那样的代码。
>代码涉及到了加减乘除四个运算以及四个运算获得实例化对象的方法。使用到的操作数和操作类型直姐写死在代码里面，因为用户输入这个愚蠢的方法被人嘲笑过，哈哈哈哈哈
```Java
// Operation.java
// 定义运算接口
interface Operation{
	// 返回运算结果
	public int getResult(int num1, int num2);
}
// AddOperation.java
// 定义加法运算类
class AddOperation implements Operation{
	// 返回运算结果
	public int getResult(int num1, int num2){
		return num1+num2;
	}
}
// MulOperation.java
// 定义乘法运算类
class MulOperation implements Operation{
	// 返回运算结果
	public int getResult(int num1, int num2){
		return num1*num2;
	}
}
// SubOperation.java
// 定义减法运算类
class SubOperation implements Operation{
	// 返回运算结果
	public int getResult(int num1, int num2){
		return num1-num2;
	}
}
// DivOperation.java
// 定义除法运算类
class DivOperation implements Operation{
	// 返回运算结果
	public int getResult(int num1, int num2){
		if(num2==0){
			System.out.println("除数不能为0");
			return 0;
		}
		return num1/num2;
	}
}
// Factory.java
abstract class Factory{
	// 获取一个具体运算的实例化对象
	public static Operation getOperation(){
		return null;
	}
}
// AddFactory.java
class AddFactory extends Factory{
	// 获取一个加法运算的实例化对象
	public static Operation getOperation(){
		return new AddOperation();
	}
}
// MulFactory.java
class MulFactory extends Factory{
	// 获取一个乘法运算的实例化对象
	public static Operation getOperation(){
		return new MulOperation();
	}
}
// DivFactory.java
class DivFactory extends Factory{
	// 获取一个除法运算的实例化对象
	public static Operation getOperation(){
		return new DivOperation();
	}
}
// SubFactory.java
class SubFactory extends Factory{
	// 获取一个减法运算的实例化对象
	public static Operation getOperation(){
		return new SubOperation();
	}
}
// Calculator.java
public class Calculator{
	/* 操作数直接初始化，运算类型直接指定，输入都是废话 */
	static int num1 = 120; // 第一个操作数
	static int num2 = 10;  // 第二个操作数
	static int result = 0; // 运算结果
	public static void main(String []srgs){
		try{
			// 加法运算
			Operation op1 = AddFactory.getOperation();
			result = op1.getResult(num1,num2);
			System.out.println(num1 + " + " + num2 + " = " + result);
			
			// 减法运算
			Operation op2 = SubFactory.getOperation();
			result = op2.getResult(num1,num2);
			System.out.println(num1 + " - " + num2 + " = " + result);
			
			// 除法运算
			Operation op3 = DivFactory.getOperation();
			result = op3.getResult(num1,num2);
			System.out.println(num1 + " * " + num2 + " = " + result);
			
			// 乘法运算
			Operation op4 = MulFactory.getOperation();
			result = op4.getResult(num1,num2);
			System.out.println(num1 + " / " + num2 + " = " + result);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
```
>到这里工厂模式就算全部结束了，目标就是用Java实现常用的23个设计模式。