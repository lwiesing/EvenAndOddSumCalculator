public class Main {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 7, 9, 12, 15, 18};
        int limit = 10;
        int sumEven = 0;
        int sumOdd = 0;

        // For loop to iterate through the array and calculate sums
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
                System.out.println(numbers[i] + " is even, adding to sumEven.");
            } else {
                sumOdd += numbers[i];
                System.out.println(numbers[i] + " is odd, adding to sumOdd.");
            }
        }

        // While loop to balance the sums until sumEven exceeds sumOdd
        int adjustment = 1;
        while (sumEven <= sumOdd) {
            System.out.println("Balancing sums: sumEven = " + sumEven + ", sumOdd = " + sumOdd);
            sumEven += adjustment;  // Incrementally adjust sumEven to balance
            adjustment++;

            // Nested if condition with additional else if
            if (adjustment > 5) {
                System.out.println("Adjustment too high, breaking the loop.");
                break;
            } else if (adjustment == 3) {
                System.out.println("Adjustment is exactly 3, applying a reduction to sumOdd.");
                sumOdd -= 2; // Reduces sumOdd by 2 if adjustment is exactly 3
            } else {
                System.out.println("Adjustment is within limit, continuing the loop.");
                sumOdd += 1; // Increments sumOdd by 1 for other cases
            }
        }

        // Final output of sums
        System.out.println("Final sumEven: " + sumEven);
        System.out.println("Final sumOdd: " + sumOdd);
    }
}