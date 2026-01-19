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
	***** */


public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move this here
        }
    }
}
