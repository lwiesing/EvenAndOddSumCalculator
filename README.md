<!--
SPDX-FileCopyrightText: 2024 2024 Lisa Wiesinger
SPDX-FileContributor: Lisa Wiesinger

SPDX-License-Identifier: MIT
-->

# Even and Odd Sum Calculator

## Project Description
This Java project provides a utility to calculate the sums of even and odd numbers in a given array of integers. It includes a method to balance the even sum against the odd sum, ensuring the even sum exceeds the odd sum by adjusting values incrementally.

## Installation Instructions

### Prerequisites
- Java Development Kit (JDK) 8 or higher

### Steps to Compile and Run
1. **Clone the repository** (if applicable):
   ```bash
   git clone https://github.com/lwiesing/EvenAndOddSumCalculator.git
   cd EvenAndOddSumCalculator

2. **Compile the program:**
    ```bash 
    javac EvenAndOddSumCalculator.java

3. **Run the program:**
   ```bash
   java EvenAndOddSumCalculator

## Usage
The program calculates the sums of even and odd numbers and adjusts the even sum until it exceeds the odd sum.

### Sample Input
#### Given the array:
    int[] numbers = {2, 4, 7, 9, 12, 15, 18};

### Sample Output
#### When running the program, the following output will be displayed:

    Initial Sum of Even Numbers: 36
    Initial Sum of Odd Numbers: 31
    Final Sum of Even Numbers: 42
    Final Sum of Odd Numbers: 31
    
    
## Explanation
1. The program iterates through the array to compute the sums of even (sumEven) and odd (sumOdd) numbers.
2. A while loop is employed to adjust the sumEven until it surpasses the sumOdd, incrementing the adjustment value and modifying the sums based on specific conditions.

## Contributing
Contributions are welcome! If you would like to contribute to this project, please fork the repository and submit a pull request. Make sure to add tests for any new features.

## Citation Hint
#### If you use this software in your research or projects, please cite it as follows:
    Even and Odd Sum Calculator. (2024). Retrieved from https://github.com/lwiesing/EvenAndOddSumCalculator.git

## License
This project is licensed under the MIT License. For more details have a look at the [LICENSE.txt](LICENSE.txt) 

