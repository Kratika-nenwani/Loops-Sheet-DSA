//     1
//    0 0
//   1 2 1
//  0 2 2 0
// 1 2 2 2 1

import java.util.*;
class demo63
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
            if(i==j || j==1)
                System.out.print(i%2+" ");
            else
            System.out.print("2 ");
        }
        System.out.println();

    }
    
    sc.close();
}
}