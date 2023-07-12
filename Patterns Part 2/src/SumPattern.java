import java.util.Scanner;

//Write a program to print triangle of user defined integers sum.
//sum.
//Input Format :
//A single integer, N
//Output Format :
//Required Pattern
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//1=1
//1+2=3
//1+2+3=6
//-------------------------------------------------------------------------------Java---------------------------------------------------------------------------
//------------------------------------------------------------------------By Rahul Rewar---------------------------------------------------------|

public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
          
         for(int i=1;i<=n;i++)   {

            int sum=0;
        	for(int k=1;k<=i;k++)
	     {	

         sum += k;
          if(k==i) 
	         System.out.print(k);
               else
          System.out.print(k+ "+");
           			
      }
          System.out.print("="+sum);
          System.out.println();
	           
           
         }
              
	}

}
