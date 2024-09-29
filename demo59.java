// * * * * * * * * * * *
//  *                 *
//   *               *
//    *             *
//     *           *
//      *         *
//       *       *
//        *     *
//         *   *
//          * *
//           *

import java.util.*;
class demo59
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
    for (int i = n; i >=1; i--) {
        for(int j=n;j>i;j--)
        {
            System.out.print(" ");
        }
    
        for (int j = i; j >0; j--) {
            if(j==1||i==n||i==j)
                System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();

    }
    
    sc.close();
}
}