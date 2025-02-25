import java.util.Scanner;
class StudentInfo{

	public static void main(String args[]){
	 
		Scanner input=new Scanner(System.in);
		String username;
		String password;
		

		Student S1=new Student("Taha Nadeem",3.42,"Lahore");
		Student S2=new Student("Sulaiman Khalid",3.2,"Sargodha");
		Student S3=new Student("Muhammad Saad",3.7,"Pattoki");

		System.out.print("Enter username: ");
		username=input.next();
		System.out.print("Enter Password: ");
		password=input.next();

		
			if(username.equals(Login.getUsername())){

				if(password.equals(Login.getPassword())){
	
					System.out.printf("**********Student Information**********\n");
					System.out.printf("\t\tStudent 1:\t\t\n");
					System.out.printf("Student ID: %s\n",S1.getId());
					System.out.printf("Name: %s\n",S1.getName());
					System.out.printf("CGPA: %.2f\n",S1.getCgpa());
					System.out.printf("Address: %s\n\n",S1.getAddress());

					System.out.printf("\t\tStudent 2:\t\t\n");
					System.out.printf("Student ID: %s\n",S2.getId());
					System.out.printf("Name: %s\n",S2.getName());
					System.out.printf("CGPA: %.2f\n",S2.getCgpa());
					System.out.printf("Address: %s\n\n",S2.getAddress());

					System.out.printf("\t\tStudent 3:\t\t\n");
					System.out.printf("Student ID: %s\n",S3.getId());
					System.out.printf("Name: %s\n",S3.getName());
					System.out.printf("CGPA: %.2f\n",S3.getCgpa());
					System.out.printf("Address: %s\n",S3.getAddress());
					
				}
				else{
					System.out.print("Incorrect Password!");
					
				}

			}
			else{
				System.out.print("Incorrect Username!");
			}
		
	}

}