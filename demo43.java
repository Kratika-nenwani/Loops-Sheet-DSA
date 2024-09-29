//     1
//    232
//   34543
//  4567654
// 567898765

import java.util.*;
class demo43
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();

    for (int i = 1; i <= n; i++) {

    
        for (int j = n; j > i; j--) {
            System.out.print("    ");
        }

        for (int j = i; j <2*i; j++) {
            System.out.print(j+"   ");
        }

        for (int j = 2*i-2; j>=i; j--) {
            System.out.print(j+"   ");
        }

        System.out.println();

    }
    sc.close();
}
}