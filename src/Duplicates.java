import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        Random num = new Random();

        int[] Array1 = new int[10];
        int[] Array2 = new int[10];

        System.out.println("Array1 numbers are: ");
        for (int i = 0; i<Array1.length; i++) {
            Array1[i] = num.nextInt(20) + 1;
            System.out.print(Array1[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Array2 numberes are: ");
        for (int j = 0; j<Array1.length; j++) {
            Array2[j] = num.nextInt(20) + 1;
            System.out.print(Array2[j]+ " ");
        }

        System.out.println();

        System.out.println("The duplicate numbers are: ");
        for (int i = 0; i<Array1.length; i++) {
            for (int j = 0; j<Array2.length; j++) {
                if (Array1[i] == Array2[j])
                    System.out.println(Array1[i]);

            }
        }
    }
}
