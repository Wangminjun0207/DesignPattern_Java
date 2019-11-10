// MainClass.java
public class MainClass{
	public static void main(String []args){
		// ����һ��������С��
		PersonThinBuilder builder1 = new PersonThinBuilder();
		// �������ʵ��С�˵���������
		PersonDirector director = new PersonDirector();
		director.makePerson(builder1);
		Person person1 = builder1.getPerson();
		// ��������С�˵�����
		person1.show();
		
		// ����һ�����ֵ�С��
		PersonFatBuilder builder2 = new PersonFatBuilder();
		// �������ʵ��С�˵���������
		director.makePerson(builder2);
		Person person2 = builder2.getPerson();
		// ��������С�˵�����
		person2.show();
	}
}