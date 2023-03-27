public class twoDimensionalArray {
    public static void main(String[] args) {
        int[][] grades = {{14, 20, 8}, {3,7,15}};
        System.out.println(grades[0][1]);
        System.out.println(grades[1][1]);

        //access all elements through nested loop
        System.out.println("your 2D Array is: ");
        for (int i =0; i<grades.length; i++) {
            for (int j=0; j<grades[i].length; j++) {
                System.out.print(grades[i] [j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
