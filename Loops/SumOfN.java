import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while(i <= n) {
            sum = sum + i;  // adding each number
            //sum += i;  // this is a shorter way to write the above line
            i++;
        }

        sc.close();

        System.out.println("Sum of first " + n + " numbers is: " + sum);
    }
}