// Tie.java
// Tie类，用Tie装饰person
class Tie extends Finery{
	// 展示装饰结果
	public void show(){
		System.out.print("Tie  ");
		super.show();
	}
}