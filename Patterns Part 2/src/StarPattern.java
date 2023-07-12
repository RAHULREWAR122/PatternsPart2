import java.util.Scanner;

//Print the following pattern
//Pattern for N = 4
//Hint
//As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
//The dots represent spaces.
//
//
//
//Input Format :
//N (Total no. of rows)
//Output Format :
//Pattern in N lines
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//   *
//  *** 
// *****
//-------------------------------------------------------------------------------Java---------------------------------------------------------------------------
//------------------------------------------------------------------------By Rahul Rewar---------------------------------------------------------|

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<=n){
			int j = 1;
			while(j<=(n-i)){
				System.out.print(" ");
				j++;
			}

		    	int k = 1;
			  while(k<=(2*i)-1){
				System.out.print('*');
				k++;
			}
		    	System.out.println();
		    	i++;
		}
		
	}

}
