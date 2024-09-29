// 1
// 2 3
// 4 5 6
// 7 8 9 10

import java.util.*;
class demo25
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
    int count=1;
	for(int i=n;i>0;i--)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print((count++)+" ");

		}
		System.out.println();
	}
    sc.close();
}
}