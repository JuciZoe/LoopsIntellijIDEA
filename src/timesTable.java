import java.util.Scanner;
public class timesTable {
    public static void main(String[] args) {
    Scanner Reader = new Scanner(System.in);
        System.out.println("What times table would you like?");
        int timesTable = Reader.nextInt();

        for (int x = 1; x <= 12; x++) {
            System.out.print(timesTable + " * " + x + " = " + timesTable*x);
            System.out.print("\n");

        }

    }
}
