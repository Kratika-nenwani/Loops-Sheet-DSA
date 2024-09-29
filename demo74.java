// 0 1 0 1 0
// 0 0 0 0 0
// 0 1 0 1 0
// 0 0 0 0 0
// 0 1 0 1 0 

import java.util.*;  
class demo74 {  
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the value of n => ");  
        int n = sc.nextInt();  
        for (int i = 1; i <=n; i++) {  
            
            for (int j = 1; j <= n; j++) {
                if(j==3||i%2==0||j==1||j==n)
                    System.out.print(0+" ");
                else
                System.out.print("1 ");
                    
                
            }  
            System.out.println();  
        }  
        sc.close();  
    }  
} 
