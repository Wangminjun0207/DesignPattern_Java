// PersonDirector.java
// 构造小人的指挥者类
class PersonDirector{
	// 构造一个客户端指定的小人
	public void makePerson(PersonBuilder builder){
		builder.BuildHead(); 
        builder.BuildBody(); 
        builder.BuildWeight();
	}
}