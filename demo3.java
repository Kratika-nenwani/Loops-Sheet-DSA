// 1 2 3 4 5 
// 2 3 4 5 
// 3 4 5 
// 4 5 
// 5

import java.util.*;
class demo3
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();

	for(int i=1;i<n+1;i++)
	{
		for(int j=i;j<n+1;j++)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
        sc.close();
	}
}
}