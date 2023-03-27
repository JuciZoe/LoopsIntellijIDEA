import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        String reversedString = "";
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = reader.nextLine().toCharArray();
        System.out.println(letters);

        for (int i = letters.length-1; i>=0; i--) {
            reversedString = reversedString + letters[i];
        }
        System.out.print(reversedString);
    }
}
