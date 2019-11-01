// AbstractFactory.java
// 定义核心工厂接口
interface AbstractFactory{
	// 获取一个Student类型的对象
	public static Student getStudentObject(){
		return null;
	}
	// 获取一个Teacher类型的对象
	public static Teacher getTeacherObject(){
		return null;
	}
}