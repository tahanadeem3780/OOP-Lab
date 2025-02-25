import java.util.Scanner;
public class SecondLab{

	public static void main (String arg[]){

	Scanner input=new Scanner(System.in);
	Scanner input1=new Scanner(System.in);

	//Integer Variables

	System.out.print("Enter byte value: ");
	byte b=input.nextByte();

	System.out.print("Enter short value: ");
	short s=input.nextShort();

	System.out.print("Enter integer value: ");
	int i=input.nextInt();

	System.out.print("Enter long value: ");
	long l=input.nextLong();

	//Float Variables

	System.out.print("Enter float value: ");
	float f=input.nextFloat();

	System.out.print("Enter Double value: ");
	double d=input.nextDouble();

	//Char Variables

	System.out.print("Enter character value: ");
	char ch=input.next().charAt(0);

	//Boolean variable

	System.out.print("Enter bool value: ");
	boolean bl=input.nextBoolean();

	//string for single word
	
	System.out.print("Enter a string value(Single Word): ");
	String str=input.next();

	//string for complete line
	
	System.out.print("Enter a string value(Single Line): ");
	String str1=input1.nextLine();

	System.out.printf(" \nValue in byte : %d \n",b);
	System.out.printf(" Value in short : %d \n",s);
	System.out.printf(" Value in int : %d \n",i);
	System.out.printf(" Value in long : %d \n",l);

	System.out.printf(" Value in float : %,.2f \n",f);
	System.out.printf(" Value in double : %,.2f \n",d);

	System.out.printf(" Value in bool : %b \n",bl);

	System.out.printf(" Value in string (Single Word) : %s \n",str);
	System.out.printf(" Value in string (Single Line): %s \n",str1);

}

}