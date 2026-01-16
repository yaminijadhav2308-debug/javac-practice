//take a character and check whether uppercase or lowercase...
/*import java.util.Scanner;
public class day03 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character:");
	char ch=sc.next().charAt(0);
	if(ch >= 'A' && ch <= 'Z')
		System.out.println("UPPERCASE");
	else if(ch>='a' && ch<='z')
		System.out.println("LOWERCASE");
	else
		System.out.println("It is not a alphabet");
	

	}

}*/
//Take age as input and check whether the person is eligible to vote...
/*import java.util.Scanner;
public class day03{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println("eligible for vote");
		else 
			System.out.println("not eligible for vote");
		
	}
}*/
//Take a number and check whether it is a 3-digit number or no...
/*import java.util.Scanner;
public class day03{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num>=100 && num<=999 || num<=-100 && num>=-999)
			System.out.println("it is a three digit number...");
		else
			System.out.println("not a three digit number...");
	}
}*/
//Take a character and check whether it is a vowel or consonant...
/*import java.util.Scanner;
public class day03{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char..");
		char ch=sc.next().charAt(0);
		ch=Character.toLowerCase(ch);
		if(ch>='a' && ch<='z') {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println("it is vowel,,");
				}
			else {
				System.out.println("it is consonant");
				}
	
		}
		else {
			System.out.println("it is not a alphabet..");
		}
		
	}
}*/
//Take a number and check whether it is a multiple of 5 or not...
import java.util.Scanner;
public class day03{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number...");
		int num=sc.nextInt();
		if(num%5==0)
			System.out.println("divisible by 5..");
		else
			System.out.println("not divisible by 5..");
	}
}