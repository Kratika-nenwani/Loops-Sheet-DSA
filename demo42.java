//         1
//       2 2 2
//     3 3 3 3 3
//   4 4 4 4 4 4 4
// 5 5 5 5 5 5 5 5 5

import java.util.*;
class demo42
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
        for(int k=i;k<n;k++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=i*2-1;j++)
		{
           
			System.out.print(i+" ");

		}
		System.out.println();
	}
    sc.close();
}
}