import java.util.Scanner;
class Scan3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name:");
		String s1=sc.next();
		System.out.println("Enter Last Name:");
		String s2=sc.next();
	    System.out.println("Your Full Name is:"+s1+ " "+s2);

		System.out.println("Enter Your Age:");
		byte b=sc.nextByte();
			System.out.println("Age:"+b);

			System.out.println("Enter empolyee number");
			short s3=sc.nextShort();
			System.out.println("Employee number:"+s3);


			System.out.println("Enter Your Salary");
			int i1=sc.nextInt();
			System.out.println("Salary:"+i1);

	      System.out.println("Enter mobile number");
		  long l1=sc.nextLong();
		  System.out.println("Mobile Number:" +l1);

		  System.out.println("Enter Experience in Decimal:");
			  float f=sc.nextFloat();
		  System.out.println("Experience:"+f);

		  System.out.println("Enter expected increment in lakhs in decimal");
		  double d=sc.nextDouble();
		  System.out.println("Expected Increment:"+d);


		  System.out.println("Enter 10th Grade");
		  char ch=sc.next().charAt(0);
		  System.out.println("Grade:"+ch);

		  System.out.println("Are You Completed java say in true or false:");
		  boolean b1=sc.nextBoolean();
		  System.out.println("java is completed:"+b1);














	}
}
