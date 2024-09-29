// 0
// 1 2
// 3 4 0
// 1 2 3 4

import java.util.*;
class demo29
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
    int count=0;
	for(int i=n;i>0;i--)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print((count++)+" ");
            if(count==5)count=0;

		}
		System.out.println();
	}
    sc.close();
}
}