// *         *         *
// *         *         *
// *         *         *
// *         *         *
// *         *         *
// * * * * * * * * * * *
//           *
//           *
//           *
//           *
//           *           

import java.util.*;
class demo61
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
    for (int i = 1; i <= n; i++) {
       
        for (int j = 1; j <=n; j++) {
            if(j==6||i==6||(j==11 &&i<6)||(j==1&&i<6))
                System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();

    }
    
    sc.close();
}
}