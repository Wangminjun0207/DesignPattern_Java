// WorkExperience.java
import java.lang.String;

// 工作经历类
class WorkExperience implements Cloneable{
	private String workDate;   // 工作时间
	private String company;    // 工作地点
	
	// 设置工作时间
	public void setWorkDate(String workDate){
		this.workDate = workDate;
	}
	// 返回工作时间
	public String getWorkDate(){
		return this.workDate;
	}
	// 设置工作地点
	public void setCompany(String company){
		this.company = company;
	}
	// 返回工作地点
	public String getCompany(){
		return this.company;
	}
	// 克隆函数
	public WorkExperience clone(){
		try{
			return (WorkExperience)super.clone();
		}catch(Exception e){
			return null;
		}
	}
}