import java.util.Scanner; 
public class wk1pm7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of rows: "); 
        int rows= sc.nextInt(); 
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < rows-i-1; j++)
            { 
                System.out.print(" "); 
            } 
            for (int j = 0; j <=i; j++) 
            {
                System.out.print(" "+fact(i)/(fact(j)*fact(i-j))); 
                
            } 
            System.out.println(); 
            
        } 
        for (int i = rows-2; i >= 0; i--) 
        {
            for (int j = rows-i; j > 0; j--) 
            { 
                System.out.print(" ");
                }
            System.out.print("1");
            for (int j =i- 1; j >=0; j--) 
            {
                System.out.print(" "+fact(i)/(fact(j)*fact(i-j)));
            } 
            System.out.println(); 
            
        } 
        
    }
    public static int fact(int n)
    {
        if(n==0)
        return 1;
        else
        return (n*fact(n-1));
    }
}