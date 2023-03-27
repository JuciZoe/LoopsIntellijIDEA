import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        int sumTotal = 0; int sum = 1;
        while ( sum <= sumTo) {
            System.out.print(sum + " + " + sumTotal + " = " +  (sum+sumTotal));
            sumTotal = sumTotal + sum;
            sum = sum + 1;
            System.out.print("\n");

        }

    }
}
