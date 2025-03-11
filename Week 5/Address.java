public class Address{

	private String street;
	private String city;

	Address(String street, String city){
		this.street=street;
		this.city=city;

	}

	Address(Address other){
		street=other.street;
		city=other.city:
	}

	void showAddress (){
		System.out.println("Street: "+street);
		System.out.println("City: "+city);
	}

	String getStreet(){
		return street;
	}
	
	void setStreet(String street){
		this.street=street;
	}

	String getCity(){
		return City;
	}
	
	void setCity(String city){
		this.city=city;
	}
}