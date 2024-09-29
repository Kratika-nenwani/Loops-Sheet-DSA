// 5   6   7   8   9   8   7   6   5
//     4   5   6   7   6   5   4
//         3   4   5   4   3
//             2   3   2
//                 1   

import java.util.*;
class demo47
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

        for (int j = i; j<i*2; j++) {
            System.out.print(j+"   ");
        }
        for (int j = (i*2)-2; j>=i; j--) {
            System.out.print(j+"   ");
        }

        System.out.println();

    }
    sc.close();
}
}