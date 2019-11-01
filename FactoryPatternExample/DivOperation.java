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