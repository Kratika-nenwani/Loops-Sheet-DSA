//     A
//    B C
//   D E F
//  G H I J
// K L M N O

import java.util.*;
class demo54
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
    int ch=65;
    for (int i = 1; i <=n; i++) {
        for(int j=n;j>i;j--)
        {
            System.out.print(" ");
        }
    
        for (int j = 1; j <= i; j++) {
                System.out.print((char)ch+" ");
                ch++;
        }
        System.out.println();

    }
    
    sc.close();
}
}