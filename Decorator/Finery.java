// Finery.java
class Finery extends Person{
	private Person person;
	
	// 装饰方法
	public void Decorate(Person component){
		this.person = component;
	}
	// 展示装饰结果
	public void show(){
		if(person != null){
			person.show();
		}
	}
}