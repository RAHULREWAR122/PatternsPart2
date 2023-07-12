import java.util.Scanner;

//number of rows.
//For N = 4
//1357
//3571
//5713
//7135
//Input Format :
//A single integer: N
//Output Format :
//Required Pattern
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//135
//351
//513

//-------------------------------------------------------------------------------Java---------------------------------------------------------------------------
//------------------------------------------------------------------------By Rahul Rewar---------------------------------------------------------|

public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                for (int i = 1; i <= n; i++)
        {
            for (int j = i - 1; j < n; j++ )
           {
             System.out.print(j * 2 + 1 + "");
          }
            for(int k = 0; k < i - 1; k++)
           {
            System.out.print(k * 2 + 1 + "");
          }
            System.out.println();
          }
	}

}
