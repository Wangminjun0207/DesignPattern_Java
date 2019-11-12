// Suit.java
// Suit类，用Suit装饰person
class Suit extends Finery{
	// 展示装饰结果
	public void show(){
		System.out.print("Suit  ");
		super.show();
	}
}