//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *

import java.util.*;
class demo51
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
                System.out.print("* ");
            
        }
        System.out.println();

    }
    for (int i = n-1; i >=1; i--) {
        for(int j=i;j<n;j++)
        {
            System.out.print("  ");
        }
    
        for (int j = 1; j <= i*2-1; j++) {
                System.out.print("* ");
            
        }
        System.out.println();

    }
    sc.close();
}
}

// Alternate

// import java.util.*;
// class demo51
// {
// public static void main(String args[])
// {
    
// 	Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the value of n => ");
// 	int n=sc.nextInt();

//     for (int i = 1; i <=n; i++) {

    
//         for (int j = 1; j <= n; j++) {
//             if(i+j>=n-3&&j-i<=n-5&&i-j<=n-5&&i+j<=n+5)
//             {
//                 System.out.print("* ");
//             }
//             else{
//                 System.out.print("  ");   
//             }
            
//         }
//         System.out.println();

//     }
//     sc.close();
// }
// }