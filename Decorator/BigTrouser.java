// BigTrouser.java
// BigTrouser类，用BigTrouser装饰person
class BigTrouser extends Finery{
	// 展示装饰结果
	public void show(){
		System.out.print("BigTrouser  ");
		super.show();
	}
}