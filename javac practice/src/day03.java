//take a character and check whether uppercase or lowercase...
import java.util.Scanner;
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

}
