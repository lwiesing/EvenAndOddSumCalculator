// SPDX-FileCopyrightText: 2024 2024 Lisa Wiesinger
// SPDX-FileContributor: Lisa Wiesinger
//
// SPDX-License-Identifier: MIT

public class Main {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 7, 9, 12, 15, 18};
        int sumEven = 0;
        int sumOdd = 0;

        // For loop to iterate through the array and calculate sums
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        // While loop to balance the sums until sumEven exceeds sumOdd
        int adjustment = 1;
        while (sumEven <= sumOdd) {
            sumEven += adjustment;  // Incrementally adjust sumEven to balance
            adjustment++;

            // Nested if condition with additional else if
            if (adjustment > 5) {
                break; //adjustment too high, breaking the loop.
            } else if (adjustment == 3) {
                sumOdd -= 2; // Reduces sumOdd by 2 if adjustment is exactly 3
            } else {
                sumOdd += 1; // Increments sumOdd by 1 for other cases
            }
        }
    }
}