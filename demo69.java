// 1 2 0 1 2
// 2 0 1 2
// 0 1 2
// 1 2
// 2

import java.util.*;  
class demo69 {  
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the value of n => ");  
        int n = sc.nextInt();  
         
        for (int i = 1; i <= n; i++) {  
           
            for (int j = i; j <= n; j++) {  
               
                    System.out.print((j % 3) + " ");  
                
            }  
            System.out.println();  
        }  
        sc.close();  
    }  
} 
