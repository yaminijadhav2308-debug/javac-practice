// sum of two no.s..
/*import java.util.Scanner;
public class FunctionMethods {
	public static int calculateSum(int a,int b){
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=calculateSum(a,b);
		System.out.println("Sum of two no..:"+sum);
	}
}*/

//Product of two nos...
/*import java.util.Scanner;
public class FunctionMethods{
	public static int calculateProduct(int a,int b) {
		int product=a*b;
		return product;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int product=calculateProduct(a,b);
		System.out.println("product of two no is:" +product);
	}
}*/

//Factorial of no;
import java.util.Scanner;
public class FunctionMethods{
	public static void printFactorial(int n) {
		if (n<0) {
			System.out.println("Invalid no");
			return;
		}
		int factorial=1;
		for(int i=n;i>=1;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		return;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	printFactorial(n);
	}
}
	
