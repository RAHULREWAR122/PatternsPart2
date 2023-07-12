import java.util.Scanner;

//For N = 4
//The dots represent spaces.
//Input Format :
// A single integer : N
//Output Format :
//Required Pattern
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//***
// ***
//  ***
//-------------------------------------------------------------------------------Java---------------------------------------------------------------------------
//------------------------------------------------------------------------By Rahul Rewar---------------------------------------------------------|

public class ParallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
	       for(int i=1;i<=n;i++) {
	    
	        for(int j=1;j<i;j++)
	        {
	            System.out.print(" ");
	        }
	          for(int k=1;k<=n;k++)
	        {
	            System.out.print("*");
	        }
	           System.out.println();
	        }
	}

}
