    //       *
//          * *
//         *   *
//        *     *
//       *       *
//      *         * 
//     *           *
//    *             *
//   *               *
//  *                 * 
// * * * * * * * * * * *

import java.util.*;
class demo58
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
    for (int i = 1; i <=n; i++) {
        for(int j=n;j>i;j--)
        {
            System.out.print(" ");
        }
    
        for (int j = 1; j <= i; j++) {
            if(j==1||i==n||i==j){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();

    }
    
    sc.close();
}
}