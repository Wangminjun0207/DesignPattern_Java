// MaleFactory.java
// ������Ĺ��ӿ�
class MaleFactory implements AbstractFactory{
	// ��ȡһ��FemaleStudent���͵Ķ���
	public static Student getStudentObject(){
		return new MaleStudent();
	}
	// ��ȡһ��FeamleTeacher���͵Ķ���
	public static Teacher getTeacherObject(){
		return new MaleTeacher();
	}
}