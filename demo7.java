// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4
// 5

import java.util.*;
class demo7
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();

	for(int i=1;i<n+1;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
	}
}
}