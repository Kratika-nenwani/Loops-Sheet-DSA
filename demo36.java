// 1 2 3 4 5
// 5 4 3 2 1
// 1 2 3 4 5
// 5 4 3 2 1
// 1 2 3 4 5 
//6-j logic will also work

import java.util.*;
class demo36
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{   int count=5;
		for(int j=1;j<=n;j++)
		{
            if((i)%2==0)
			System.out.print((count--)+" ");
            else
			System.out.print(j+" ");


		}
		System.out.println();
	}
    sc.close();
}
}