// Resume.java
import java.lang.String;

// ���������࣬ʵ�ֽӿ�Cloneable
class Resume implements Cloneable{
	private String name;  // ����
	private String sex;   // �Ա�
	private String age;   // ����
	private WorkExperience workExperience; // ��������
	
	// ���캯��
	public Resume(){
		workExperience = new WorkExperience();
	}
	// ��ʾ������Ϣ
	public void Display(){
		System.out.println("name: " + this.name);
		System.out.println("sex : " + this.sex);
		System.out.println("age : " + this.age);
		System.out.println("workDate: " + this.workExperience.getWorkDate());
		System.out.println("company : " + this.workExperience.getCompany());
	}
	// ���ø�����Ϣ
	public void setInfo(String name, String sex, String age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	// ���ù�������
	public void setWorkExperience(String workDate, String company){
		this.workExperience.setWorkDate(workDate);
		this.workExperience.setCompany(company);
	}
	// ��¡����
	public Resume clone(){
		try{
			Resume resume = (Resume)super.clone();
			resume.workExperience = workExperience.clone();
			return resume;
		}catch(Exception e){
			return null;
		}
	}
}