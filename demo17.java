// 1 2 3 4 5
// 2 2 3 4 5
// 3 3 3 4 5
// 4 4 4 4 5
// 5 5 5 5 5

import java.util.*;
class demo17
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
            if(i<=j)
			System.out.print(j+" ");
            else
			System.out.print(i+" ");

		}
		System.out.println();
	}
    sc.close();
}
}