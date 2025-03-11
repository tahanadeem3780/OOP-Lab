public class Date{
	
	private int day;
	private int month;
	private int year;
	
	Date(int day, int month, int year){

		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	Date(int month, int year){

		this.month=month;
		this.year=year;
	}

	Date(Date d){
		day=d.day;
		month=d.month;
		year=d.year;

	}

	void showDate (){
		System.out.printf("%d-%d-%d\n",day,month,year);
	}

	int getDay (){
		return day;
	}

	void setDay (int day){
		this.day=day;
	}

	int getMonth (){
		return month;
	}

	void setMonth (int month){
		this.month=month;
	}

	int getYear (){
		return year;
	}

	void setYear (int year){
		this.year=year;
	}
}