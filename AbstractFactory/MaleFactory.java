// MaleFactory.java
// 定义核心工接口
class MaleFactory implements AbstractFactory{
	// 获取一个FemaleStudent类型的对象
	public static Student getStudentObject(){
		return new MaleStudent();
	}
	// 获取一个FeamleTeacher类型的对象
	public static Teacher getTeacherObject(){
		return new MaleTeacher();
	}
}