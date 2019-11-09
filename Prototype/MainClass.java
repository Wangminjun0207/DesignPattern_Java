// MainClass.java
public class MainClass{
	public static void main(String []args){
		// 创建第一个简历实例对象
		Resume resume1 = new Resume();
		resume1.setInfo("xxx","male","30岁");  // 设置个人信息
		resume1.setWorkExperience("2017/10-2018/12","YY公司"); // 设置工作经历
		resume1.Display();  // 显示所有信息
		
		// 创建第二个简历实例对象
		Resume resume2 = resume1.clone(); // 克隆对象
		resume2.Display();  // 显示所有信息
		
		resume1.setInfo("www","male","25岁"); // 修改resume1的个人信息
		resume1.Display();  // 显示修改后resume1的所有信息
		resume2.Display();  // 显示修改后resume2的所有信息
		
		resume1.setWorkExperience("2017/10-2020/12","XX公司"); // 修改resume1的工作经历
		resume1.Display();  // 显示修改后resume1的所有信息
		resume2.Display();  // 显示修改后resume2的所有信息
	}
}