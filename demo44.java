//                 5
//             5   4   5
//         5   4   3   4   5
//     5   4   3   2   3   4   5
// 5   4   3   2   1   2   3   4   5

import java.util.*;
class demo44
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();

    for (int i = n; i > 0; i--) {

    
        for (int j = 1; j < i; j++) {
            System.out.print("    ");
        }

        for (int j = n; j>i; j--) {
            System.out.print(j+"   ");
        }

        for (int j = i; j<=n; j++) {
            System.out.print(j+"   ");
        }

        System.out.println();

    }
    sc.close();
}
}