import java.util.*;

public class wk1pm5{

    public static void main(String a[]) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int temp=n;
        int r=0;
        while(temp>0)
        {
            int rem=temp%10;
            temp=temp/10;
            r=(r*10)+rem;
        }
        if(r==n)
        {
            System.out.println("The reversed number is "+r+".It is the same as the original.");
        }
        else
        {
            System.out.println("The reversed number is "+r+".It is not the same as the original.");
        }
       
    }
}