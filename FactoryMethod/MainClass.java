// MainClass.java
public class MainClass{
	public static void main(String []args){
		// ����һ��Appleʵ�����󣬵��ù�������
		Fruit apple = AppleFactory.getFruit();
		// ����һ��Bananaʵ�����󣬵��ù�������
		Fruit banana = BananaFactory.getFruit();
		// ����һ��Pearʵ�����󣬵��ù�������
		Fruit pear = PearFactory.getFruit();
		apple.get();
		banana.get();
		pear.get();
	}
}