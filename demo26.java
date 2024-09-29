// 0
// 1 1
// 2 3 5
// 8 13 21 34

import java.util.*;
class demo26
{
public static void main(String args[])
{
	int a=-1;
	int b=1;
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
	int c=0;
	for(int i=n;i>0;i--)
	{
		for(int j=i;j<=n;j++)
		{
            c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println();
	}
    sc.close();
}
}