// MainClass.java
public class MainClass{
	public static void main(String []args){
		// ��ȡ��һ��ʵ��������
		SingletonSluggard sluggard1 = SingletonSluggard.getInstance();
		System.out.println(sluggard1.getInfo());
		
		// ��ȡ�ڶ���ʵ��������
		SingletonSluggard sluggard2 = SingletonSluggard.getInstance();
		System.out.println(sluggard2.getInfo());
		
		// �Ƚ����������Ƿ���ͬһ��
		if(sluggard1==sluggard2){
			System.out.println("����������ͬһ��ʵ��������");
		}
	}
}