// MainClass.java
public class MainClass{
	public static void main(String []args){
		// ��ȡ��һ��ʵ��������
		SingletonHungry hungry1 = SingletonHungry.getInstance();
		System.out.println(hungry1.getInfo());
		
		// ��ȡ�ڶ���ʵ��������
		SingletonHungry hungry2 = SingletonHungry.getInstance();
		System.out.println(hungry2.getInfo());
		
		// �Ƚ����������Ƿ���ͬһ��
		if(hungry1==hungry2){
			System.out.println("����������ͬһ��ʵ��������");
		}
	}
}