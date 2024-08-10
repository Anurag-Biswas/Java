import java.util.*;
class Array
{
    int f=1;
    int s=0;
    int c=0;
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter four values");
        int n[]=new int[4];
        for(int i=0;i<4;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i=1;i<4;i++)
        {
            f=f*n[i];
            s+=f;
            if(s==n[i])
            {
                System.out.println("Perfect numbers="+n[i]);
            }
        }
    }
}