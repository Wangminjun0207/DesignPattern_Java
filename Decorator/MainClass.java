// MainClass.java
public class MainClass{
	public static void main(String []args){
		Person person = new Person("xxx");
		Suit suit = new Suit();
		BigTrouser bigt = new BigTrouser();
		Tie tie = new Tie();
		TShirts tshirts = new TShirts();
		bigt.Decorate(person);
		tie.Decorate(bigt);
		suit.Decorate(tie);
		suit.show();
		/* suit.Decorate(person);
		tie.Decorate(suit);
		tshirts.Decorate(tie);
		tshirts.show(); */
	}
}