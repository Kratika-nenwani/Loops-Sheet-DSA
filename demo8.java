// 5
// 5 4
// 5 4 3
// 5 4 3 2
// 5 4 3 2 1

import java.util.*;
class demo8
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();

	for(int i=n;i>0;i--)
	{
		for(int j=n;j>=i;j--)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
	}
}
}