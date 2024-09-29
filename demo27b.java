// 
// 1
// 2 3
// 5 7 11
// 13 17 19 23
// 29 31 37 41 43

class demo27b
{
public static void main(String args[])
{
	int x=1;
    int p=0,k=0;
	for(int i=1;i<44;i++)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
            {
                x=0;
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
        x=1;
		
	}
}
}