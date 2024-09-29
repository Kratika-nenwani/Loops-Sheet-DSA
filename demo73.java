// 0    1    1    2    3
// 5    8    13    21
// 34    55    89
// 144    233
// 377

import java.util.*;  
class demo73 {  
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the value of n => ");  
        int n = sc.nextInt();  
         int a=-1,b=1,c=0;
        for (int i = 1; i <=n; i++) {  
            
            for (int j = i; j <= 5; j++) {
                c=a+b;
                    System.out.print(c+"    ");
                    a=b;
                    b=c;
                
            }  
            System.out.println();  
        }  
        sc.close();  
    }  
} 
