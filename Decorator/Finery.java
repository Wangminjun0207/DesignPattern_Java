// Finery.java
class Finery extends Person{
	private Person person;
	
	// װ�η���
	public void Decorate(Person component){
		this.person = component;
	}
	// չʾװ�ν��
	public void show(){
		if(person != null){
			person.show();
		}
	}
}