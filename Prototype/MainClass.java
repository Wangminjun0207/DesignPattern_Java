// MainClass.java
public class MainClass{
	public static void main(String []args){
		// ������һ������ʵ������
		Resume resume1 = new Resume();
		resume1.setInfo("xxx","male","30��");  // ���ø�����Ϣ
		resume1.setWorkExperience("2017/10-2018/12","YY��˾"); // ���ù�������
		resume1.Display();  // ��ʾ������Ϣ
		
		// �����ڶ�������ʵ������
		Resume resume2 = resume1.clone(); // ��¡����
		resume2.Display();  // ��ʾ������Ϣ
		
		resume1.setInfo("www","male","25��"); // �޸�resume1�ĸ�����Ϣ
		resume1.Display();  // ��ʾ�޸ĺ�resume1��������Ϣ
		resume2.Display();  // ��ʾ�޸ĺ�resume2��������Ϣ
		
		resume1.setWorkExperience("2017/10-2020/12","XX��˾"); // �޸�resume1�Ĺ�������
		resume1.Display();  // ��ʾ�޸ĺ�resume1��������Ϣ
		resume2.Display();  // ��ʾ�޸ĺ�resume2��������Ϣ
	}
}