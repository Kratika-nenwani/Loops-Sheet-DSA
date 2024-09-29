//         1
//       2 2 2
//     3 3 3 3 3
//   4 4 4 4 4 4 4
// 5 5 5 5 5 5 5 5 5
//   4 4 4 4 4 4 4
//     3 3 3 3 3
//       2 2 2
//         1

import java.util.*;
class demo52
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();

    for (int i = 1; i <=n; i++) {
        for(int j=n;j>i;j--)
        {
            System.out.print("  ");
        }
    
        for (int j = 1; j <= i*2-1; j++) {
                System.out.print(i+" ");
            
        }
        System.out.println();

    }
    for (int i = n-1; i >=1; i--) {
        for(int j=i;j<n;j++)
        {
            System.out.print("  ");
        }
    
        for (int j = 1; j <= i*2-1; j++) {
                System.out.print(i+" ");
            
        }
        System.out.println();

    }
    sc.close();
}
}