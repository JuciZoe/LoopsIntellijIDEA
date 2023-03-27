import java.util.Random;
public class MaxAndMin {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] myArray = new int[10];

        for (int i = 0; i<myArray.length; i++){
            myArray[i] = rand.nextInt(10)+1;
            System.out.println("Print my array " + myArray[i]); // print the array
        }

        int max = 0; // initiate variable maxValue, assign array index 0
        int min = 0; // // initiate variable minValue, assign array index 0
        for (int i = 0; i<myArray.length; i++) {
            if (myArray[i] > max) { //   // find the biggest value
                max = myArray[i];
            }
            if (myArray[i] < min) { //find the smallest value
                min = myArray[i];
            }
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
