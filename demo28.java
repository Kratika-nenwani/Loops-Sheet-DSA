
// 4 
// 6 8 
// 9 10 12 
// 14 15 16 18 
// 20 21 22 24 25 

class demo28
{
public static void main(String args[])
{
	int x=0;
    int p=0,k=0;
	for(int i=1;i<26;i++)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
            {
                x=1;
                break;
            }

		}
        if(x==1)
        {
            if(k==p)
            {
                k=0;
                System.out.println();
                p++;
            }
            k++;
            System.out.print(i+" ");
        }
        x=0;
		
	}
}
}