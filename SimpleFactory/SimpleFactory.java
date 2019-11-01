// SimpleFactory.java
public class SimpleFactory{
	/* // 获得Apple的实例化
	public static Fruit getApple(){
		// 这里使用静态函数，方便用类名直接调用
		return new Apple();
	}
	
	// 获得Banana的实例化
	public static Fruit getBanana(){
		// 这里使用静态函数，方便用类名直接调用
		return new Banana();
	} */
	// get方法，获得所有对象
	public static Fruit get(String type)
	{
		// 判断传来的字符串的值，获得相应对象
		if(type.equalsIgnoreCase("Apple")){
			return new Apple();
		}else if(type.equalsIgnoreCase("Banana")){
			return new Banana();
		}else{
			return null;
		}
	}
}
