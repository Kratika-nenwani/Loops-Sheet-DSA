// 2 3 4 5 6
// 3 4 5 6 7
// 4 5 6 7 8
// 5 6 7 8 9
// 6 7 8 9 10

import java.util.*;
class demo11
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
			System.out.print(i+j+ " ");
		}
		System.out.println();
	}
}
}