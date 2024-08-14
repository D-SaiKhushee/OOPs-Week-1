import java.util.Scanner;

public class wk1pm1 {

    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
 
        int T = scanner.nextInt();
       
        for (int i = 0; i < T; i++) {
            try {
                
                long n = scanner.nextLong(); 
                System.out.println(n + " can be fitted in:");
                
                
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
                
            } catch (Exception e) {
                System.out.println("Can't fit anywhere");
            }
            System.out.println("Can't fit anywhere");
        }
        
        
    }
}
