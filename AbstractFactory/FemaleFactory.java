// FemaleFactory.java
// ������Ĺ��ӿ�
class FemaleFactory implements AbstractFactory{
	// ��ȡһ��FemaleStudent���͵Ķ���
	public static Student getStudentObject(){
		return new FemaleStudent();
	}
	// ��ȡһ��FeamleTeacher���͵Ķ���
	public static Teacher getTeacherObject(){
		return new FemaleTeacher();
	}
}