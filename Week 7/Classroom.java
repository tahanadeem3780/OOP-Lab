public class Classroom{

	private String name;
	private String classCode;
	private Teacher teacher;
	Student [] students = new Student[5];

	Classroom(String name, String classCode){
		this.name=name;
		this.classCode=classCode;
	}

	public void setTeacher(Teacher t){
		this.teacher=t;
	}
	public void addStudent(Student s){
		int counter=0;
		if(counter<students.length){
			students[counter++] = new Student(s.getName(),s.getAge(),s.getRollNo());
		}
		else{
			System.out.println("No vacant seat available for students!");
		}
	}
}