// *  *  *  *  * 
// *  *  *  *
// *  *  *
// *  *
// *
// this using single loop

import java.io.*;
public class demo76 {
    public static void main(String args[])throws IOException
    {
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(i);
        System.out.println("Enter n");
        int n=Integer.parseInt(br.readLine());
        int a=n;
        int b=1;

        while(a>0)
        {
            if(a==b)
            {
                a--;
                b=1;
                System.out.println(" * ");
            }
            else{
                b++;
                System.out.print(" * ");
            }
        }


    }
    
}