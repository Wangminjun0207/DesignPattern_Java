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