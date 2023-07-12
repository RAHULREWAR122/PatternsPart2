import java.util.Scanner;

//Pattern for N = 4
//The dots represent spaces.
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints :
//0 <= N <= 50
//Sample Input 1:
//5
//Sample Output 1:
//           1
//         232
//       34543
//     4567654
//   567898765
//-------------------------------------------------------------------------------Java---------------------------------------------------------------------------
//------------------------------------------------------------------------By Rahul Rewar---------------------------------------------------------|

public class TriangleofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

				for(int i=1;i<=n;i++){
					
					for(int sp=1;sp<=n-i;sp++) {
		               System.out.print(" ");
					}
						for(int j=i;j<=2*i-1;j++) {
							
						System.out.print(j);
						}
						int a=2*i-2;
						for(int k=1;k<=i-1;k++) {
							System.out.print(a);
							a--;
						}
						System.out.println();
			}
	}

}
