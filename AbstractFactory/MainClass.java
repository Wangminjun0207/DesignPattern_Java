// MainClass.java
public class MainClass{
	public static void main(String []args){
		// ���ù�����ʵ��һ��FemaleStudent����
		Student femaleStudent = FemaleFactory.getStudentObject();
		// femaleStudent���ҽ���
		femaleStudent.introduce();
		// ���ù�����ʵ��һ��FemaleTeacher����
		Teacher femaleTeacher = FemaleFactory.getTeacherObject();
		// femaleTeacher���ҽ���
		femaleTeacher.introduce();
		
		// ���ù�����ʵ��һ��MaleStudent����
		Student maleStudent = MaleFactory.getStudentObject();
		// maleStudent���ҽ���
		maleStudent.introduce();
		// ���ù�����ʵ��һ��MaleTeacher����
		Teacher maleTeacher = MaleFactory.getTeacherObject();
		// maleTeacher���ҽ���
		maleTeacher.introduce();
	}
}