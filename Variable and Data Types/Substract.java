import java.util.*;

public class Substract
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the First number::");
            int a = sc.nextInt();
            
            System.out.println("Enter the Second number::");
            int b = sc.nextInt();

            int sub = a - b;

            System.out.println("The Substraction of " + a + " and " + b + " is:: " + sub  );
        } 
    }
    
}
