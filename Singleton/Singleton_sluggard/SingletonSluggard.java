// SingletonSluggard.java
import java.lang.String;
class SingletonSluggard{
	private String Info;
	// ����ʵ��������
	private static SingletonSluggard singleton = null;
	// ˽�й��캯������ֻ֤��һ��ʵ��������
	private SingletonSluggard(){}
	// ����Ψһʵ����������
	public static SingletonSluggard getInstance(){
		// ��ֹ���̲߳�ͬ���������ʵ��������
		if(singleton==null){
			synchronized(SingletonSluggard.class){
				
				if(singleton==null){
					singleton = new SingletonSluggard();
					singleton.Info = "����ʽ����ģʽ";
				}
			}
		}
		return singleton;
	}
	// ���ض�����Ϣ
	public String getInfo(){
		return Info;
	}
}
	