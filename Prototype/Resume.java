// Resume.java
import java.lang.String;

// 创建简历类，实现接口Cloneable
class Resume implements Cloneable{
	private String name;  // 姓名
	private String sex;   // 性别
	private String age;   // 年龄
	private WorkExperience workExperience; // 工作经历
	
	// 构造函数
	public Resume(){
		workExperience = new WorkExperience();
	}
	// 显示个人信息
	public void Display(){
		System.out.println("name: " + this.name);
		System.out.println("sex : " + this.sex);
		System.out.println("age : " + this.age);
		System.out.println("workDate: " + this.workExperience.getWorkDate());
		System.out.println("company : " + this.workExperience.getCompany());
	}
	// 设置个人信息
	public void setInfo(String name, String sex, String age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	// 设置工作经历
	public void setWorkExperience(String workDate, String company){
		this.workExperience.setWorkDate(workDate);
		this.workExperience.setCompany(company);
	}
	// 克隆方法
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