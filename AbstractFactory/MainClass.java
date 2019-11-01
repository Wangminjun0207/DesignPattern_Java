// MainClass.java
public class MainClass{
	public static void main(String []args){
		// 调用工厂，实例一个FemaleStudent对象
		Student femaleStudent = FemaleFactory.getStudentObject();
		// femaleStudent自我介绍
		femaleStudent.introduce();
		// 调用工厂，实例一个FemaleTeacher对象
		Teacher femaleTeacher = FemaleFactory.getTeacherObject();
		// femaleTeacher自我介绍
		femaleTeacher.introduce();
		
		// 调用工厂，实例一个MaleStudent对象
		Student maleStudent = MaleFactory.getStudentObject();
		// maleStudent自我介绍
		maleStudent.introduce();
		// 调用工厂，实例一个MaleTeacher对象
		Teacher maleTeacher = MaleFactory.getTeacherObject();
		// maleTeacher自我介绍
		maleTeacher.introduce();
	}
}