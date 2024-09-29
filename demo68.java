// 0 0 0 0 0 
//  0 1 0 1 
//   0 1 2 
//    0 1 
//     1
//Incorrect code needs to be corrected

import java.util.*;  
class demo68 {  
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the value of n => ");  
        int n = sc.nextInt();  
         
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j < i; j++) {  
                System.out.print(" ");  
            }  
             
            for (int j = i; j <= n; j++) {  
                if (j == i || j == n || i == 1) {  
                    System.out.print("0 ");  
                } else {  
                    System.out.print((j - i) + " ");  
                }  
            }  
            System.out.println();  
        }  
        sc.close();  
    }  
} 
