// 1 2 3 4 5
// * * * * *
// 1 2 3 4 5
// * * * * *
// 1 2 3 4 5

import java.util.*;
class demo16
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();

	for(int i=1;i<n+1;i++)
	{
		for(int j=1;j<n+1;j++)
		{
            if(i%2==0)
			System.out.print("* ");
            else
			System.out.print(j+" ");

		}
		System.out.println();
	}
    sc.close();
}
}