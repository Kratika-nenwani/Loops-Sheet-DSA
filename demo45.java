// 5   5   5   5   5   5   5   5   5
//     4   4   4   4   4   4   4
//         3   3   3   3   3
//             2   2   2   
//                 1

import java.util.*;
class demo45
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();

    for (int i = n; i > 0; i--) {

    
        for (int j = n; j > i; j--) {
            System.out.print("    ");
        }

        for (int j = 1; j<i*2; j++) {
            System.out.print(i+"   ");
        }

        System.out.println();

    }
    sc.close();
}
}