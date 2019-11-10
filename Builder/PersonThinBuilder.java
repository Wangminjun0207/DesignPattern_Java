// PersonThinBuilder.java
// 瘦弱小人的建造者类
class PersonThinBuilder extends PersonBuilder{
	Person person = new Person();
	
	public void BuildHead(){
		person.setHead("细长");
	}
	public void BuildBody(){
		person.setBody("经不起风吹");
	}
	public void BuildWeight(){
		person.setWeight("30KG");
	}
	// 返回建造的瘦弱小人
	public Person getPerson(){
		return person;
	}
}