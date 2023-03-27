public class SumAvgArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        for (int i =0; i<numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println("The sum of the numbers is " + sum);

        double avg = sum/numbers.length;
        System.out.println("The average of the numbers is " + avg);
    }
}
