//          0
//       0  1  0
//    0  2  3  4  0
// 0  5  6  7  8  9  0

import java.util.*;
class demo55
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
    int ch=1;
    for(int j=1;j<=n;j++)
        {
            System.out.print("   ");
        }
    System.out.println("0");
    for (int i = 1; i <=n; i++) {
        for(int j=n;j>i;j--)
        {
            System.out.print("   ");
        }
        
        System.out.print("0  ");
        for (int j = 1; j <= 2*i-1; j++) {
            
                System.out.print(ch+"  ");
                ch++;
        }
        
        System.out.print("0");
        System.out.println();

    }
    
    sc.close();
}
}