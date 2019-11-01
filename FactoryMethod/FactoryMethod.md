# ��������ģʽ
��������ģʽͬ��������Ĵ�����ģʽ���ֱ���Ϊ��̬����ģʽ����������ģʽ�������Ƕ���һ��������Ʒ����Ľӿڣ���ʵ�ʴ��������Ƴٵ����൱�С����Ĺ����಻�ٸ����Ʒ�Ĵ����������������Ϊһ�����󹤳���ɫ����������幤���������ʵ�ֵĽӿڣ�������һ���ų��󻯵ĺô���ʹ�ù�������ģʽ����ʹϵͳ�ڲ��޸ľ��幤����ɫ������������µĲ�Ʒ������Թ�������ģʽ�ͼ򵥹���ģʽҲ�бȽϡ�
##### 1.����ʵ��
>��һ�棺���ȰѺ��Ĺ�����������������ʵ������Ʒ����Ľӿڣ���������ȥʵ�֡������һ����˾���쵼��֪��Ҫ��ʲô�����ǲ�����������ȥ�ɣ������õ��µ�Ա��ȥ����ĸ�������顣��Ӳ�Ʒ��͹������Լ����ԵĴ������£�
```Java
// FruitFactory.java
abstract class FruitFactory{
	// �������Ա����������ʵ�֣�����һ��ʵ��������
	public static Fruit getFruit(){
		return null;
	}
}
// AppleFactory.java
class AppleFactory extends FruitFactory{
	// ��̬��Ա����������һ��Appleʵ������
	public static Fruit getFruit(){
		return new Apple();
	}
}
// BananaFactory.java
class BananaFactory extends FruitFactory{
	// ��̬��Ա����������һ��Bananaʵ������
	public static Fruit getFruit(){
		return new Banana();
	}
}
// Fruit.java
interface Fruit{
	// ����ˮ����ժ������ʵ��
	public void get();
}
// Apple.java
class Apple implements Fruit{
	public void get(){
		System.out.println("�ɼ�ƻ��");
	}
}
// Banana.java
class Banana implements Fruit{
	public void get(){
		System.out.println("�ɼ��㽶");
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []args){
		// ����һ��Appleʵ�����󣬵��ù�������
		Fruit apple = AppleFactory.getFruit();
		// ����һ��Bananaʵ�����󣬵��ù�������
		Fruit banana = BananaFactory.getFruit();
		apple.get();
		banana.get();
	}
}
```
>�ڶ��棺�����ʱ�������²�Ʒ��Ҫ��˾���������ѵ�Ҫ���쵼�𣿿������в�ͨ�ģ���ô���뵽�İ취�����Ҹ�����ݹ�������Ա��������ڻ��쵼���ĸ���ʵ�ʣ����Ҹ��ӵĺ����ڳ����ж�Ӧ�ľ��ǲ�ȥ�ĺ��Ĺ����࣬���������һ���ӹ������һ����Ʒ�ࡣ�������£�
```Java
// PearFactory.java
class PearFactory extends FruitFactory{
	// ��̬��Ա����������һ��Appleʵ������
	public static Fruit getFruit(){
		return new Pear();
	}
}
// Banana.java
class Pear implements Fruit{
	public void get(){
		System.out.println("�ɼ�����");
	}
}
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
```
##### 2.ģʽ�а����Ľ�ɫ����ְ��
* ���󹤳���Creator����ɫ
��������ģʽ�ĺ��ģ��κι����඼����ʵ������ӿڡ�
* ���幤����Concrete Creator����ɫ
���幤�����ǳ��󹤳���һ��ʵ�֣�����ʵ����Ʒ����
* ����Product����ɫ
��������ģʽ�����������ж���ĸ��࣬��������������ʵ�������еĹ����ӿڡ�
* �����Ʒ��Concrete Product����ɫ
��������ģʽ�������ľ����ʵ������
##### 3.��������ģʽ�ͼ򵥹���ģʽ�Ƚ�
* ��������ģʽ��򵥹���ģʽ�ڽṹ�ϵĲ�ͬ���Ǻ����ԡ�����������ĺ����ǳ���һ�������࣬���򵥹���ģʽ�ǰѺ�����ŵ�һ���������ϡ�
* ��������ģʽ֮������һ�������ж�̬����ģʽ����Ϊ���幤���඼�й�ͬ�ĳ����࣬�����й�ͬ�Ľӿڡ�
* ��ϵͳ��Ҫ����µĲ�Ʒ�����ʱ�򣬽�����Ҫ���һ����������Լ����幤���࣬ԭ�еĹ���������Ҫ�����κε��޸ģ��ܺõķ����ˡ����š�����ա�ԭ�򡣶��򵥹���ģʽ������²�Ʒ����󲻵ò��޸Ĺ�����������չ�Բ��á�
* ��������ģʽ�˻�������ݱ�ɼ򵥹���ģʽ��