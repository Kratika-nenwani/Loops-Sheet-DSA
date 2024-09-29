// 1
// 2 3
// 5 7 11
// 13 17 19 23
// 29 31 37 41 43

import java.util.*;
class demo27
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
    int total_prime=(n*(n+1))/2;
    int arr[]=new int[total_prime];
    int count=2;
    int prime=3;
    arr[0]=1;
    arr[1]=2;
    
    while(count<total_prime)
    {
        boolean isPrime=true;
        for(int i=2;i<prime;i++)
        {
            if(prime%i==0)
            {
                isPrime=false;
                break;
            }
            
        }
        if(isPrime==true)
        {
            arr[count]=prime;
            count++;
        }
        prime++;
    }
    count=0;
	for(int i=n;i>0;i--)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print(arr[count++]+" ");

		}
		System.out.println();
	}
    sc.close();
}
}