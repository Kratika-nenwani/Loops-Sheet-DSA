// * * * * *
//     * * *
//       * *
//     * * *
// * * * * *

import java.util.*;  
class demo72 {  
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the value of n => ");  
        int n = sc.nextInt();  
         
        for (int i = 1; i <=n; i++) {  
            
            for (int j = 1; j <= n; j++) {
              if(i==1||i==n||j==n-1||j==n||(j==n-2&&i!=3))
                System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }  
            System.out.println();  
        }  
        sc.close();  
    }  
} 
