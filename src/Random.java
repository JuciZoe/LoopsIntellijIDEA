public class Random {
    public static void main(String[] args) {
        java.util.Random randomGenerator = new java.util.Random();

        int diceNumber = randomGenerator.nextInt(6)+1; // specify boundary
        System.out.println("The dice number is " + diceNumber);

        //extension of crazyDice, boundary between 1-10

        int crazyDiceNumber = randomGenerator.nextInt(10)+1; // specify boundary
        System.out.println("The crazy dice number is " + crazyDiceNumber);
    }
}
