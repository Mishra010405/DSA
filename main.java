import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner Sc  = new Scanner(System.in);
        int n = Sc.nextInt();
        int counter = 0;
        int sum =0;
        
        while(n>0) {
            int digits = n%10;
            sum = sum+digits;
            n= n/10;

        }

        System.out.println("Sum is "+ sum);

        
    }    
            
        }

    
        
    
