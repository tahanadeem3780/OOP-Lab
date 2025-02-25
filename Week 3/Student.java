class Student{
	
	private static String preId="FA24-BCS-";
	private static int rollNo=1;
	private String Id;
	private String name;
	private double cgpa;
	private String address;

	Student(String StudentName,double StudentCgpa,String StudentAddress){
		Id=preId+String.format("%03d",rollNo);
		rollNo++;
		name=StudentName;
		cgpa=StudentCgpa;
		address=StudentAddress;
		
	}


	String getId(){
		return Id;
	}
	
	
	String getName(){
		return name;
	}

	
	double getCgpa(){
		return cgpa;
	}
	
	 
	String getAddress(){
		return address;
	}
}