public class Student extends Person{

	private int rollNo;
	private int rollNoCounter = 1;

	Student(String name, int age){
		this.setName(name);
		this.setAge(age);
		this.rollNo= rollNoCounter++;
	}
	
	Student(String name, int age, int rollNo){
		this.setName(name);
		this.setAge(age);
		this.rollNo= rollNo;
	}
	
	public int getRollNo(){
		return rollNo;
	}

	/*public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}*/
	
	boolean equals (Student s1){
		if (this.rollNo==s1.rollNo)
			return true;
		else
			return false;
	}

	public String toString(){

		return String.format("Student Name: %s/n Student Roll No: %03d/n Age: %02d/n",getName(),getRollNo(),getAge());
	}
}