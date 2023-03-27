import java.util.Scanner;
public class Integer_input {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner reader = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter number: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = reader.nextInt();
        }
        System.out.println("your numbers are: ");

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Your odd numbers are: ");
        for (int i =0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
