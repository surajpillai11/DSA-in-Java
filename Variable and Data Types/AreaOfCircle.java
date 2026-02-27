import java.util.*;

public class AreaOfCircle 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of the circle::");
            double r = sc.nextDouble();
            double area = 3.14 * r * r;
            System.out.println("The Area of the Circle is:: " + area  );
        }
        
    }
    
}
