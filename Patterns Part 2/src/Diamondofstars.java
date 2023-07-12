import java.util.Scanner;

//Note: N is always odd.
//Pattern for N = 5

//The dots represent spaces.
//Input format :
//N (Total no. of rows and can only be odd)
//Output format :
//Pattern in N lines
//Constraints :
//1 <= N <= 49
//Sample Input 1:
//5
//Sample Output 1:
//  *
// ***
//*****
// ***
//  *
//-------------------------------------------------------------------------------Java---------------------------------------------------------------------------
//------------------------------------------------------------------------By Rahul Rewar---------------------------------------------------------|

public class Diamondofstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner  scan= new Scanner(System.in);
					int n=scan.nextInt();
					int num=n/2;
					if(n%2!=0)
					{
						num=n/2+1;
					}
			          int k=1;
					  while(k<=n)
					{        	               
		              int i=1;
			          while(i<=num)
			            {
			              int space=1;
			              while(space<=num-i) {
			               System.out.print(" ");
			               space++;
			              }
			                 int j=1;
			                 while(j<=i)
			                   {
			                     System.out.print("*");
			                      j++;
			                      k++;
			                    }
			                      j=i-1;
			                      while(j>=1)
			                    {
			                        System.out.print("*");
			                        j--;

			                    }

			                      System.out.println();
			                       i++;
			                    }
		                    
			         	
					                 int o=1;
					                  while(o<=n-2)
		                            {
					         	
							           int x=num-1;
						
						                while(x>=1   ){
					            
						             	int space=1;
						            	 while(space<=num-x)
						        	   {
							          	 System.out.print(" ");
							             	 space++;
						        	    }
						                  	int y=x;
						                	while(y>=1)
						        	   {
								         System.out.print("*");
							            	y--;
							              o++;
						        	   }
						                 	y=1;
						            	   while(y<=x-1)
						        	   {
							             	System.out.print("*");
							            	y++;
									 	}
									    	System.out.println();
						                   	x--;
		                               }
		                            }
		                        }
	}

}
