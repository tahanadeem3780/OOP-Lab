import java.util.Scanner;
public class InputDemo{
	
	public static void main (String args[]){
		
		Scanner input=new Scanner(System.in);
		Scanner input1=new Scanner(System.in);

		System.out.println("Ths is input demo code.");
		
		//Integer primitive types
		byte b=1;
		short s=123;
		int i=1000;
		long l=23424;

		System.out.print("Enter byte value: ");
		b=input.nextByte();

		System.out.print("Enter short value: ");
		s=input.nextShort();

		//types with decimal values
		float f=10.0f;
		double d=1000000.00;
		double d1=1000000000.00000;

		System.out.print("Enter float value: ");
		f=input.nextFloat();

		//for char
		char  c='\n';

		System.out.print("Enter char value: ");
		c=input.next().charAt(0);

		//for binary values
		boolean bool=true;

		System.out.print("Enter boolean value: ");
		bool=input.nextBoolean();

		

		//string for single word
		System.out.print("Enter a string value(Single Word): ");
		String str=input.next();

		//string for complete line
		System.out.print("Enter a string value(Single Line): ");
		String str1=input1.nextLine();

		System.out.printf(" Value in byte : %04d \n",b);
		System.out.printf(" Value in short : %d \n",s);
		System.out.printf(" Value in int : %d \n",i);
		System.out.printf(" Value in long : %d \n",l);

		System.out.printf(" Value in float : \t %.2f \n",f);
		System.out.printf(" Value in double : %,.2f \n",d);
		System.out.printf(" Value in double : %,.2f \n",d1);

		System.out.printf(" Value in string (Single Word) : %s \n",str);
		System.out.printf(" Value in string (Single Line): %s \n",str1);

	}
}