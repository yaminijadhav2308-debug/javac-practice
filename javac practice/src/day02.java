//palindrome no...
/*import java.util.Scanner;
public class day02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		int original=num;
		int rev=0;
		for(; num>0;num=num/10) {
			int digit=num%10;
			rev=rev*10+digit;
		}
		if(original==rev)
			System.out.println("Palindrome no...");
		else
			System.out.println("Not a palindrome no..");

	}

}*/

//arithmatic operations....

/*import java.util.Scanner;
public class day02{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		System.out.println("sum:" +(a+b));
		System.out.println("diff:" +(a-b));
		System.out.println("multi:" +(a*b));
		System.out.println("div:" +(a/b));
	}
}*/

//Take marks of a student and print the grade..
/*import java.util.Scanner;
public class day02{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks=sc.nextInt();
		if(marks>=90)
			System.out.println("Grade A..");
		else if(marks>=75)
			System.out.println("Grade B..");
		else if(marks>=60)
			System.out.println("Grade C..");
		else
			System.out.println("Fail");
	}
}*/

//program to check whether a number is positive, negative, or zero...
/*import java.util.Scanner;
public class day02{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num>0)
			System.out.println("no is positive");
		else if(num<0)
			System.out.println("no is negative");
		else
			System.out.println("no is zero");
		
	}
}*/

//Largest no..
/*import java.util.Scanner;
public class day02{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num:");
		int a = sc.nextInt();
		System.out.println("enter second num:");
		int b = sc.nextInt();
		System.out.println("enter third num:");
		int c = sc.nextInt();
		if(a>=b && a>=c)
			System.out.println("Largest no is" +a);
		else if(b>=a && b>=c)
			System.out.println("Largest no is" +b);
		else
			System.out.println("Largest no is" +c);
	}
}*/

//print even no from 1 to 50...
/*public class day02{
	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			if(i%2==0)
				System.out.println(i);
		}
	}
}*/

//using Scanner class..
import java.util.Scanner;
public class day02{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no..");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		if(i%2==0)
			System.out.println(i);
	}
	}
}
