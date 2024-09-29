// 1 2 3 2 1
// 2 2 3 2 2
// 3 3 3 3 3
// 2 2 3 2 2
// 1 2 3 2 1

import java.util.*;  
class demo70 {  
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the value of n => ");  
        int n = sc.nextInt();  
         
        for (int i = 1; i <= n; i++) {  
            int count=2;  
            for (int j = 1; j <= n; j++) {
                
               if(i==3||j==3)
                    System.out.print(3+ " ");  
                else if (i%2==0)
                System.out.print(2+ " "); 
                else{
                if(j<=3)System.out.print(j+" ");
                else
                System.out.print(count--+" ");}

                
            }  
            System.out.println();  
        }  
        sc.close();  
    }  
} 
