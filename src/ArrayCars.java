public class ArrayCars {
    public static void main(String[] args) {
        int[] cars = {12000, 34000, 56000, 15450, 45000};

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();

        cars[0] = 12670;

        System.out.println();

        System.out.println("The updated value is " + cars[0]);

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
    }
}
