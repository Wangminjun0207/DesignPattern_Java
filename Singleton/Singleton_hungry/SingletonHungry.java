// SingletonHungry.java
import java.lang.String;
class SingletonHungry{
	private String Info = "����ʽ����ģʽ";
	// ����ʵ��������
	private static final SingletonHungry singleton = new SingletonHungry();
	// ˽�й��캯������ֻ֤��һ��ʵ��������
	private SingletonHungry(){}
	// ����Ψһʵ����������
	public static SingletonHungry getInstance(){
		return singleton;
	}
	// ���ض�����Ϣ
	public String getInfo(){
		return Info;
	}
}
	