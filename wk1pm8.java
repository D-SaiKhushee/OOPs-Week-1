import java.util.Scanner; 
public class wk1pm8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int x=0;
            int y=0;
            int sum=0;
 
            while(x<c)
            {
                if(x==0)
                {
                    y=1;
                    sum=a+(y*b)+sum;
                }
                else
                {
                    y*=2;
                    sum=(y*b)+sum;
                }
                System.out.println(sum+" ");
                x+=1;
            }
            t--;
        }
    }
}    
