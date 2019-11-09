// WorkExperience.java
import java.lang.String;

// ����������
class WorkExperience implements Cloneable{
	private String workDate;   // ����ʱ��
	private String company;    // �����ص�
	
	// ���ù���ʱ��
	public void setWorkDate(String workDate){
		this.workDate = workDate;
	}
	// ���ع���ʱ��
	public String getWorkDate(){
		return this.workDate;
	}
	// ���ù����ص�
	public void setCompany(String company){
		this.company = company;
	}
	// ���ع����ص�
	public String getCompany(){
		return this.company;
	}
	// ��¡����
	public WorkExperience clone(){
		try{
			return (WorkExperience)super.clone();
		}catch(Exception e){
			return null;
		}
	}
}