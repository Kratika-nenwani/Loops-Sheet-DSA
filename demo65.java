// 5 5 5 5 5
// 4 4 4 4 5
// 3 3 3 4 5
// 2 2 3 4 5
// 1 2 3 4 5

import java.util.*;
class demo65
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
    for (int i = n; i >=1; i--) {
        
        for (int j = 1; j <=n; j++) {
            if(j<=i)
                System.out.print(i+" ");
            else
            System.out.print(j+" ");
        }
        System.out.println();

    }
    
    sc.close();
}
}