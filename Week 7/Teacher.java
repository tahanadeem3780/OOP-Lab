public class Teacher extends Person{

	private String subject;
	private int id;
	private int idCounter = 1;

	Teacher(String name, int age, String subject){
		this.setName(name);
		this.setAge(age);
		this.setSubject(subject);
		this.id = idCounter++;
	}
	
	public String getSubject(){
		return subject;
	}

	public void setSubject(String subject){
		this.subject=subject;
	}
	public int getId(){
		return id;
	}
	
	boolean equals (Teacher t1){
		if (this.id==t1.id)
			return true;
		else
			return false;
	}

	public String toString(){

		return String.format("Teacher Name: %s/n Teacher ID: %03d/n Age: %02d/n Subject: %s/n ",getName(),getId(),getAge(),subject);
	}
}