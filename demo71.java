// 6 7 8 9 10
// 5 6 7 8 9
// 4 5 6 7 8
// 3 4 5 6 7
// 2 3 4 5 6

import java.util.*;  
class demo71 {  
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the value of n => ");  
        int n = sc.nextInt();  
         
        for (int i = 5; i >0; i--) {  
            
            for (int j = 1; j <= n; j++) {
              
                System.out.print(i+j+" ");
            }  
            System.out.println();  
        }  
        sc.close();  
    }  
} 
