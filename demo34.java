// 0 2 3 4 5
// 1 0 3 4 5
// 1 2 0 4 5
// 1 2 3 0 5
// 1 2 3 4 0

import java.util.*;
class demo34
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{        
		for(int j=1;j<=n;j++)
		{
            if(i==j)
			System.out.print("0 ");
            else
			System.out.print(j+" ");


		}
		System.out.println();
	}
    sc.close();
}
}