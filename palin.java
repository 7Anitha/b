import java.io.*;
import java.util.*;
class palin
{
    public static void main(String arsg[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a=n,sum=0;
        while(a>0)
        {
            int b=a%10;
            sum=(sum*10)+b;
            a=a/10;
        }
        if(sum==n)
        {
            System.out.print("palindrome");
        }
        else
        System.out.print("not palindrome");
    }
}
