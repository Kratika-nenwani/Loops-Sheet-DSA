//        1
//       1 2 3
//     1 2 3 4 5
//   1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8 9
//   1 2 3 4 5 6 7
//     1 2 3 4 5
//       1 2 3
//         1

import java.util.*;
class demo53
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
                System.out.print(j+" ");
            
        }
        System.out.println();

    }
    for (int i = n-1; i >=1; i--) {
        for(int j=i;j<n;j++)
        {
            System.out.print("  ");
        }
    
        for (int j = 1; j <= i*2-1; j++) {
                System.out.print(j+" ");
            
        }
        System.out.println();

    }
    sc.close();
}
}