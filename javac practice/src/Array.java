// Take a number and print its multiplication table...
/*import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num + "x" + i + "=" +(num*i));
		}
		}
}*/

//Print numbers from 1 to 20 using a loop...
/*public class Array{
	public static void main(String[] args) {
		for(int i=1;i<=20;i++)
			System.out.println(i);
	}
}*/

//Print all even numbers between 1 and 100...
/*public class Array{
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				System.out.println(i);
			
		}
	}
}*/

//Find the sum of first 10 natural numbers...
public class Array{
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
		  sum = sum + i;
		}
		System.out.println("Sum of first 10 natural number.." +sum);
	}
}