//	PATTERENS..
/*public class Patterns {

	public static void main(String[] args) {
		int a=4;
		int b=5;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

op;
*****
*****
*****
******/


/*public class Patterns{
	public static void main(String[] args) {
		int a=4;
		int b=5;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if(i == 1 ||j == 1||i == a||j == b) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			  
			}
			System.out.println();
			
		}
	}
}

op:
	*****
	*   *
	*   *
	*****   */


/*public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
op:
	*
	**
	***
	****  */


/*public class Patterns{
	public static void main(String[] args) {
		int n = 4;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");			
				}
			System.out.println();
		}
		
	}
	
}

op:
	****
	***
	**
	*     */

/*public class Patterns{
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
op:
	    *
	   **
	  ***
	 ****   */

/*public class Patterns{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
op:
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5   */
	
/*public class Patterns{
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		} 
	}
}	
op:
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1     */
/*public class Patterns{
	public static void main(String[] args){
		int n=5;
		int number=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;			}
			System.out.println();
		}
		
	}
}
op:
	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15   */


/*public class Patterns{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
op:
	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15   */

/*public class Patterns{
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int spaces=2*(n-i);
		    for(int j=1;j<=spaces;j++) 
		    {
		    	System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++) {
		    	System.out.print("*");
		    }
		    System.out.println();
		
				
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int spaces=2*(n-i);
		    for(int j=1;j<=spaces;j++) 
		    {
		    	System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++) {
		    	System.out.print("*");
		    }
		    System.out.println();
		
				
		}
		
		
	}
}

op:
	*      *
	**    **
	***  ***
	********
	********
	***  ***
	**    **
	*      *  */


/*public class Patterns{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

op:
    *****
   *****
  *****
 *****
*****    */
 
public class Patterns{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}
op:   
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 

	