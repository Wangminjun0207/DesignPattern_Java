// TShirts.java
// TShirts类，用TShirts装饰person
class TShirts extends Finery{
	// 展示装饰结果
	public void show(){
		System.out.print("TShirts  ");
		super.show();
	}
}