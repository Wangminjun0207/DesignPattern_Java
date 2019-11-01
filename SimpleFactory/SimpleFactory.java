// SimpleFactory.java
public class SimpleFactory{
	/* // ���Apple��ʵ����
	public static Fruit getApple(){
		// ����ʹ�þ�̬����������������ֱ�ӵ���
		return new Apple();
	}
	
	// ���Banana��ʵ����
	public static Fruit getBanana(){
		// ����ʹ�þ�̬����������������ֱ�ӵ���
		return new Banana();
	} */
	// get������������ж���
	public static Fruit get(String type)
	{
		// �жϴ������ַ�����ֵ�������Ӧ����
		if(type.equalsIgnoreCase("Apple")){
			return new Apple();
		}else if(type.equalsIgnoreCase("Banana")){
			return new Banana();
		}else{
			return null;
		}
	}
}
