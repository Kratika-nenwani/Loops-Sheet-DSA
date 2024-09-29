// 1   2   3   4   5   6   7   8   9
//     1   2   3   4   5   6   7
//         1   2   3   4   5
//             1   2   3
//                 1

import java.util.*;
class demo46
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
            System.out.print(j+"   ");
        }

        System.out.println();

    }
    sc.close();
}
}