import java.util.Scanner;
public class SumNumbers2 {
    public static void main(String[] args) {
        int sumTotal = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        int sum = 1;
        while (sum <= sumTo) {
            sumTotal = sumTotal + sum;
            sum++;
        }
        System.out.println(sumTotal);
        }
}