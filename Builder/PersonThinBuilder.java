// PersonThinBuilder.java
// ����С�˵Ľ�������
class PersonThinBuilder extends PersonBuilder{
	Person person = new Person();
	
	public void BuildHead(){
		person.setHead("ϸ��");
	}
	public void BuildBody(){
		person.setBody("������紵");
	}
	public void BuildWeight(){
		person.setWeight("30KG");
	}
	// ���ؽ��������С��
	public Person getPerson(){
		return person;
	}
}