import java.util.Scanner;

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//
//
//
//
//The dots represent spaces.
//
//
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 50
//Sample Input 1:
//3
//Sample Output 1:
//      1 
//    12
//  123

//-------------------------------------------------------------------------------Java---------------------------------------------------------------------------
//------------------------------------------------------------------------By Rahul Rewar---------------------------------------------------------|
public class MirrorImageNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		;
				int n =s.nextInt();
				
				for(int i=1;i<=n;i++) {
					for(int spa=1;spa<=n-i;spa++) {
						System.out.print(" ");
					}
					for(int j=1;j<=i;j++) {
						System.out.print(j);
					}
					System.out.println();
				}
	}

}
