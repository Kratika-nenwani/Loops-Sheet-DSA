// 5 5 5 5 5
// 5 4 4 4 4
// 5 4 3 3 3
// 5 4 3 2 2
// 5 4 3 2 1

import java.util.*;
class demo64
{
public static void main(String args[])
{
    
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n => ");
	int n=sc.nextInt();
    for (int i = n; i >=1; i--) {
        
        for (int j = n; j >0; j--) {
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