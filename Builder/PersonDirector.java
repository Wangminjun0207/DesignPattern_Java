// PersonDirector.java
// ����С�˵�ָ������
class PersonDirector{
	// ����һ���ͻ���ָ����С��
	public void makePerson(PersonBuilder builder){
		builder.BuildHead(); 
        builder.BuildBody(); 
        builder.BuildWeight();
	}
}