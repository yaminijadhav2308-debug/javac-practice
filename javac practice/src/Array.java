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
/*public class Array{
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
		  sum = sum + i;
		}
		System.out.println("Sum of first 10 natural number.." +sum);
	}
}*/

/*public class Array{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello world");
		}
		
	}
}*/

/*public class Array{
	public static void main(String[] args) {
		int[] marks=new int[3];
		marks[0]=98;
		marks[1]=95;
		marks[2]=96;
		for(int i=0;i<3;i++) {
			System.out.println(marks[i]);		
			}
	}
}*/

//take user input..
/*import java.util.Scanner;
public class Array{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int number[]=new int[size];
		for(int i=0;i<size;i++) {
			number[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(number[i]);
		}
	}
}*/

//take an array as input from the user search for a given number x and print the index at which it occurs..
import java.util.Scanner;
public class Array{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int number[]=new int[size];
		for(int i=0;i<size;i++) {
			number[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		for(int i=0;i<number.length;i++) {
			if(number[i]==x) {
				System.out.println("x found at index;" +i);
			}
		}
	}
}