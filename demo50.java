// * 2 3 4 *
// 1 * 3 * 5
// 1 2 * 4 5
// 1 * 3 * 5
// * 2 3 4 *

import java.util.*;
class demo50
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();

    for (int i = 1; i <=n; i++) {

    
        for (int j = 1; j <= n; j++) {
            if(i==j||i+j==n+1)
            {
                System.out.print("* ");
            }
            else{

                System.out.print(j+" ");
            }
        }
        System.out.println();

    }
    sc.close();
}
}