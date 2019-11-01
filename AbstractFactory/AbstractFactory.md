# 抽象工厂模式
抽象工厂模式是所有形态模式中最为抽象和最具一般性的，抽象工厂模式可以向客户端提供接口，使得客户端在不必要指定产品的具体类型情况下，能够创建多个产品族的产品抽象。这里涉及到一个产品和产品族的概念，我百度百科找了一下，[产品族](https://baike.baidu.com/item/%E4%BA%A7%E5%93%81%E6%97%8F/2006840?fr=aladdin)。
##### 1.代码实现
写完抽象工厂模式的代码后发现我的例子真的不太适合来说明这个抽象工厂模式，但是能够表达清楚原理就行，不必要计较合理不合理。比如说在学校有老师和学生，这是两个产品。我们把女老师和男老师又分为不同的两个产品（对象），男学生和女学生分成两个不同的产品。现在男老师和男学生是一个产品族，女老师和女学生是一个产品族。
>现在假设只有男老师和男学生，可以通过实现老师和学生的接口来定义男老师和男学生的对象类。可以在抽象工厂继承出来一个男性工厂，用来获取一个男老师或者男学生的实例化对象。在主函数测试工厂，代码如下：
```Java
// Student.java
// 定义学生接口
interface Student{
	public void introduce();
}
// Teacher.java
// 定义教师接口
interface Teacher{
	public void introduce();
}
// MaleStudent.java
// 继承自Student类，是Student的一个产品
class MaleStudent implements Student{
	public void introduce(){
		System.out.println("I'm MaleStudent");
	}
}
// MaleTeacher.java
// 继承自Teacher类，是Teacher的一个产品
class MaleTeacher implements Teacher{
	public void introduce(){
		System.out.println("I'm MaleTeacher");
	}
}
// AbstractFactory.java
// 定义核心工厂接口
interface AbstractFactory{
	// 获取一个Student类型的对象
	public static Student getStudentObject(){
		return null;
	}
	// 获取一个Teacher类型的对象
	public static Teacher getTeacherObject(){
		return null;
	}
}
// MaleFactory.java
// 定义核心工接口
class MaleFactory implements AbstractFactory{
	// 获取一个FemaleStudent类型的对象
	public static Student getStudentObject(){
		return new MaleStudent();
	}
	// 获取一个FeamleTeacher类型的对象
	public static Teacher getTeacherObject(){
		return new MaleTeacher();
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []args){
		// 调用工厂，实例一个MaleStudent对象
		Student maleStudent = MaleFactory.getStudentObject();
		// maleStudent自我介绍
		maleStudent.introduce();
		// 调用工厂，实例一个MaleTeacher对象
		Teacher maleTeacher = MaleFactory.getTeacherObject();
		// maleTeacher自我介绍
		maleTeacher.introduce();
	}
}
```
>如果现在又有了女老师和女学生，那么就实现老师和学生的接口来定义女老师和女学生对象类。此时女老师和女学生属于一个产品族，那么还需要一个女性工厂，可以从抽象工厂继承。不需要改变任何的工厂就可以实现获取女老师和女学生的实例化工作，满足面向对象的封装的思想。在主函数测试工厂，代码如下：
```Java
// FemaleStudent.java
// 继承自Student类，是Student的一个产品
class FemaleStudent implements Student{
	public void introduce(){
		System.out.println("I'm FemaleStudent");
	}
}
// FemaleTeacher.java
// 继承自Teacher类，是Teacher的一个产品
class FemaleTeacher implements Teacher{
	public void introduce(){
		System.out.println("I'm FemaleTeacher");
	}
}
// FemaleFactory.java
// 定义核心工接口
class FemaleFactory implements AbstractFactory{
	// 获取一个FemaleStudent类型的对象
	public static Student getStudentObject(){
		return new FemaleStudent();
	}
	// 获取一个FeamleTeacher类型的对象
	public static Teacher getTeacherObject(){
		return new FemaleTeacher();
	}
}
// MainClass.java
public class MainClass{
	public static void main(String []args){
		// 调用工厂，实例一个FemaleStudent对象
		Student femaleStudent = FemaleFactory.getStudentObject();
		// femaleStudent自我介绍
		femaleStudent.introduce();
		// 调用工厂，实例一个FemaleTeacher对象
		Teacher femaleTeacher = FemaleFactory.getTeacherObject();
		// femaleTeacher自我介绍
		femaleTeacher.introduce();
	}
}
```
>貌似这个抽象工厂模式很简单也很好用，但是有个问题：如果我添加一个产品族，添加一个工厂就可以，不需要改代码，只需要添加就好。那么如果现在我要在上面的例子中添加后勤人员呢？不但需要添加新的产品，还要改之前所有的工厂，包括抽象工厂，所以对于添加新的产品非常的不友好，但是对于在原有的产品上添加新的产品族很友好。因为在抽象工厂模式添加新的产品这种做法是非常的愚蠢，肯定也就没有示例的代码。
##### 2.模式中包含的角色及其职责
* 抽象工厂（Creator）角色
抽象工厂模式的核心，包含对多个产品结构的声明，任何工厂类都必须实现这个接口。
* 具体工厂（Concrete Creator）角色
具体工厂类是抽象工厂的一个实现，负责实例化某个产品族中产品对象。
* 抽象（Product）角色
抽象模式所创建的所有对象的父类或者接口，它负责描述所有实例所共有的公共接口。
* 具体（Concrete Product）产品
抽象模式所创建的具体实例对象。
* 总结：抽象工厂中方法对应产品结构（在这个例子中就是老师和学生），具体工厂对应产品族（男性和女性）。