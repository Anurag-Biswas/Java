import java.util.*;
class PerfectNumberChecker
{
    public void main(String[]args)
    {
        int[] numbers={28,6,12,8};
        for(int number : numbers)
        {
            if (isPerfectNumber(number))
            {
                System.out.println(number+" is a perfect number.");
            }
            else
            {
                System.out.println(number+" is not a perfect number.");
            }
        }
    }
    boolean isPerfectNumber(int number)
    {
        int sum=1;
        for(int i=2;i*i<=number;i++)
        {
            if(number%i==0)
            {
                if(i*i!=number)
                {
                    sum=sum+i+number/i;
                }
                else
                {
                    sum=sum+i;
                }
            }
        }
        return sum==number && number!=1;
    }
}