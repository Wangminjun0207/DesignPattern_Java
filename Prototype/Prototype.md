# 原型模式
原型模式（Prototype）是一种对象创建型模式，它采用复制原型对象的方法来创建对象的实例。使用Prototype模式创建的实例，具有与原型一样的数据。如果是数值类型的数据，原型对象和创建的对象会各自有一份单独的数据，如果是对象类型的数据，原型对象和创建的新对象会指向同一个引用。在这里就拿程杰在《大话设计模式》一书里面的写多份简历来举例，说明整个原型模式的实现以及浅克隆和深克隆的区别。
##### 1.浅克隆代码实现
>版本一：首先拿简历来说，有姓名、年龄、性别以及工作经历等等，这里工作经历数据段是一个类对象。实现原型模式简历的复制，使用浅克隆。结果就会发现你要修改一份简历的时候，多份简历都会被修改。但是在现实中，确实需要按照不同公司的用人标准和条件投递相对应的简历，但是浅克隆实现不了这个需求。代码如下：
```java
// WorkExperience.java
import java.lang.String;

// 工作经历类
class WorkExperience{
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
}
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
			return (Resume)super.clone();
		}catch(Exception e){
			return null;
		}
	}
}
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
```
![浅克隆测试结果](https://img-blog.csdnimg.cn/2019110923511885.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mjc5NTE0MQ==,size_16,color_FFFFFF,t_70)
>从测试结果还是不难发现，克隆的对象和原型对象有相同的一份数据，改动原型对象的字符串数据之后，复制的对象数据没有发生改变，和我的预想的结果一致；但是在改动原型对象的对象成员变量之后，复制的对象的对象成员变量也随之改变，就和我预想的结果不一致了。这就是浅克隆，对象数据克隆的只是引用类型，并没有真正的复制一个对象。
##### 2. 深克隆代码实现
>版本二：接下来主要还是解决之前修改对象的对象成员变量之后克隆对象的对象成员变量也会跟着发生变化的问题。大致的想法就是给对象的对象成员变量也添加克隆函数，对象成员变量真正的也进行克隆一次，拷贝一份数据，而不是拷贝一个引用。代码如下：
```java
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
```
![深克隆测试结果](https://img-blog.csdnimg.cn/20191110001130644.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mjc5NTE0MQ==,size_16,color_FFFFFF,t_70)
>从测试结果可以看出，这次给WorkExperience类添加clone函数之后，修改原型对象的对象成员变量之后，克隆对象的对象成员变量没有发生改变，因为这次是真正的克隆了一份数据，而不是一个引用。
##### 3.原型模式应用场景
* 在创建对象的时候，我们不只是希望被创建的对象继承其基类的基本结构，还希望继承原型对象的数据。
* 希望对目标对象的修改不影响既有原型对象（深度克隆的时候完全互不影响）。
* 隐藏克隆操作的细节，很多时候，对对象本身的克隆需要设计到类本身的数据细节。