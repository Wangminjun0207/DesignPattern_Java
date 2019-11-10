// MainClass.java
public class MainClass{
	public static void main(String []args){
		// 构造一个瘦弱的小人
		PersonThinBuilder builder1 = new PersonThinBuilder();
		// 设计者来实现小人的完整构造
		PersonDirector director = new PersonDirector();
		director.makePerson(builder1);
		Person person1 = builder1.getPerson();
		// 描述瘦弱小人的特征
		person1.show();
		
		// 构造一个肥胖的小人
		PersonFatBuilder builder2 = new PersonFatBuilder();
		// 设计者来实现小人的完整构造
		director.makePerson(builder2);
		Person person2 = builder2.getPerson();
		// 描述肥胖小人的特征
		person2.show();
	}
}