public class Person{

	Private String name;
	Private String role;
	Private Address address;

	Person (String name,String role,Address address){
		this.name=name;
		this.role=role;
		this.address=new Address(address);
	}
	
	Person (Person other){
		this.name=other.name;
		this.role=other.role;
		this.address=new Address(other.address);
	}
	
	Void showPersonalDetails(){
		System.out.println("Name: "+ name);
		System.out.println("Role: "+ role);
		Person.address.showAddress();
	}
	
	String getName(){
		return name;
	}

	Void setName(String name){
		this.name=name;
	}

	String getRole(){
		return role;
	}

	Void setRole(Sting role){
		this.role=role;
	}
}