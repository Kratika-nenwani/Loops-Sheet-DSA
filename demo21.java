// 1 0 1 0 1 0 1
// 0 1 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1
// 1 0 1
// 0 1
// 1

import java.util.*;
class demo21
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();

	for(int i=1;i<n+1;i++)
	{
		for(int j=i;j<=n;j++)
		{
            if(j%2==0)
			System.out.print(0+" ");
            else
			System.out.print(1+" ");

		}
		System.out.println();
	}
    sc.close();
}
}