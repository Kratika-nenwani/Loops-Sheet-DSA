// * * * * *
// * 2 3 4 *
// * 2 3 4 *
// * 2 3 4 *
// * * * * *

import java.util.*;
class demo37
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
        
		for(int j=1;j<=n;j++)
		{
            if(i==1||j==1||i==n||j==n)
			System.out.print("* ");
            else
			System.out.print(j+" ");


		}
		System.out.println();
	}
    sc.close();
}
}