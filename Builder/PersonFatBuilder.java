// PersonFatBuilder.java
// ����С�˵Ľ�������
class PersonFatBuilder extends PersonBuilder{
	Person person = new Person();
	
	public void BuildHead(){
		person.setHead("ͷ��");
	}
	public void BuildBody(){
		person.setBody("��Բ");
	}
	public void BuildWeight(){
		person.setWeight("300KG");
	}
	// ���ؽ���ķ���С��
	public Person getPerson(){
		return person;
	}
}