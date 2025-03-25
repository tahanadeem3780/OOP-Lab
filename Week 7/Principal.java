public class Principal extends Person{

	private int experience;

	Principal(String name, int age, int experience){
		this.setName(name);
		this.setAge(age);
		this.experience=experience;
	}
	
	public int getExperience(){
		return experience;
	}

	public void getExperience(int experience){
		this.experience=experience;
	}
	

	public String toString(){

		return String.format("Principal Name: %s/n Experience: %02d/n Age: %02d/n",getName(),getExperience(),getAge());
	}
}