// Person.java
import java.lang.String;
// �����Ͷ����࣬�������͵�һЩ��������
class Person{
	private String head;   // ͷ��
	private String body;   // ����
	private String weight; // ����
	
	// ����ͷ��
	public void setHead(String head){
		this.head = head;
	}
	// ��������
	public void setBody(String body){
		this.body = body;
	}
	// ��������
	public void setWeight(String weight){
		this.weight = weight;
	}
	// �������͵ķ���
	public void show(){
		System.out.println("head  :" + this.head);
		System.out.println("body  :" + this.body);
		System.out.println("weight:" + this.weight);
	}
}