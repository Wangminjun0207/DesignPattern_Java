// PersonFatBuilder.java
// 肥胖小人的建造者类
class PersonFatBuilder extends PersonBuilder{
	Person person = new Person();
	
	public void BuildHead(){
		person.setHead("头大");
	}
	public void BuildBody(){
		person.setBody("腰圆");
	}
	public void BuildWeight(){
		person.setWeight("300KG");
	}
	// 返回建造的肥胖小人
	public Person getPerson(){
		return person;
	}
}