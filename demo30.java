// 0
// 1 2
// 0 1 2
// 0 1 2 0

import java.util.*;
class demo30
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
            if(count==3)count=0;

		}
		System.out.println();
	}
    sc.close();
}
}