package JavaMethods;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {
    // Method to check whether a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compareNumbers(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 == number2) {
            return 0; // both are equal
        } else {
            return -1; // number1 is smaller
        }
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] storeDigitsInArray(int num, int count) {
        int[] digitsArray = new int[count];
        for (int i = count; i > 0; i--) {
            int digit = num % 10;
            digitsArray[i - 1] = digit;
            num /= 10;
        }
        return digitsArray;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmStrongNumber(int[] digits, int num, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += (int) Math.pow(digits[i], count);
        }
        if (num == sum) {
            return true;
        }
        return false;
    }

    public static int[] findLargestAndSecondLargestNumbers(int[] digits) {
        int[] arr = new int[2];
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        arr[0] = largest;
        arr[1] = secondLargest;
        return arr;
    }

    public static int[] findSmallestAndSecondSmallestNumbers(int[] digits) {
        int[] arr = new int[2];
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }

        }
        arr[0] = smallest;
        arr[1] = secondSmallest;
        return arr;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sumOfSquares = 0;
        for (int i = 0; i < digits.length; i++) {
            sumOfSquares += (int) Math.pow(digits[i], 2);
        }
        return sumOfSquares;
    }

    public static boolean isHarshadNum(int num, int sumOfDigits) {
        return num % sumOfDigits == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequencyArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i; //First column to store (0-9) numbers
        }

        //count frequency
        for (int digit : digits) {
            frequencyArray[digit][1]++;
        }
        return frequencyArray;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversedArray = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedArray[i] = digits[digits.length - i - 1];
        }
        return reversedArray;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        // Step 1: Check if the lengths are equal
        if (arr1.length != arr2.length) {
            return false; // Arrays can't be equal if their lengths differ
        }

        // Step 2: Compare elements of both arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // Return false if any pair of elements differ
            }
        }

        return true; // Return true if all elements match
    }

    public static boolean isPalindrome(int number) {
        // Step 1: Convert the number into an array of digits
        int count = countDigits(number);
        int[] digitsArray = storeDigitsInArray(number, count);

        // Step 2: Reverse the array of digits
        int[] reversedArray = reverseArray(digitsArray);

        // Step 3: Compare the original and reversed arrays
//        for (int i = 0; i < digitsArray.length; i++) {
//            if (digitsArray[i] != reversedArray[i]) {
//                return false; // Not a palindrome
//            }
//        }
//        return true; // It is a palindrome
        return compareArrays(digitsArray, reversedArray);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeonNumber(int n) {
        int square = n * n;
        int c = countDigits(square);
        int[] squareArray = storeDigitsInArray(square, c);
        int sumOfSquareDigits = sumOfDigits(squareArray);
        if (sumOfSquareDigits == n) {
            return true;
        }
        return false;
    }

    public static int ProductOfDigits(int n) {
        int product = 1, count = countDigits(n);
        int[] digits = storeDigitsInArray(n, count);
        for (int i = 0; i < count; i++) {
            product *= digits[i];
        }
        return product;
    }

    public static boolean isSpyNumber(int n) {
        int c = countDigits(n);
        int[] digits = storeDigitsInArray(n, c);
        int sumOfDigits = sumOfDigits(digits);
        int productOfDigits = ProductOfDigits(n);
        if (sumOfDigits == productOfDigits) {
            return true;
        }
        return false;
    }

    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        // Check if square ends with the number
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzzNumber(int num) {
        // Check if the number is divisible by 7 or ends with 7
        return num % 7 == 0 || num % 10 == 7;
    }

    public static int[] findFactors(int num) {
        int count = 0;
        // Count the factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        // Store the factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            if (factor != num) { // Exclude the number itself
                sum += factor;
            }
        }
        return sum == num;
    }

    public static boolean isAbundantNumber(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            if (factor != num) { // Exclude the number itself
                sum += factor;
            }
        }
        return sum > num;
    }

    public static boolean isDeficientNumber(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            if (factor != num) { // Exclude the number itself
                sum += factor;
            }
        }
        return sum < num;
    }

    public static boolean isStrongNumber(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit); // Call the factorial method
            temp /= 10;
        }
        return sum == num;
    }

    // Helper Method to Calculate Factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store 5 numbers

        // Input: Take user input for 5 numbers
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Loop through the array and process each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (isPositive(number)) {
                System.out.print("Number " + number + " is positive and ");
                if (isEven(number)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number " + number + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int comparisonResult = compareNumbers(first, last);

        System.out.print("\nComparison of the first and last elements: ");
        if (comparisonResult == 1) {
            System.out.println("The first number (" + first + ") is greater than the last number (" + last + ").");
        } else if (comparisonResult == 0) {
            System.out.println("The first number (" + first + ") is equal to the last number (" + last + ").");
        } else {
            System.out.println("The first number (" + first + ") is less than the last number (" + last + ").");
        }

        //Part 2
        int number;
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        //find count of digits
        int countOfDigits = countDigits(number);
        //store digits of number in an array
        int[] digitsArray = storeDigitsInArray(number, countOfDigits);
        //check for duck number
        boolean isDuck = isDuckNumber(digitsArray);
        //check if armstrong number
        boolean isArmstrongNum = isArmStrongNumber(digitsArray, number, countOfDigits);
        //find largest and second-largest elements
        int[] largestAndSecondLargest = findLargestAndSecondLargestNumbers(digitsArray);
        //find smallest and second-smallest numbers
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallestNumbers(digitsArray);

        int sumOfDigits = sumOfDigits(digitsArray);
        int sumOfSquares = sumOfSquaresOfDigits(digitsArray);
        boolean isHarshadNum = isHarshadNum(number, sumOfDigits);
        int[][] frequencyArray = findDigitFrequency(digitsArray);
        int[] reversedArray = reverseArray(digitsArray);
        boolean areArraysEqual = compareArrays(digitsArray, reversedArray);
        boolean isNumPalindrome = isPalindrome(number);
        boolean isPrime = isPrime(number);
        boolean isNeonNumber = isNeonNumber(number);
        boolean isSpyNumber = isSpyNumber(number);
        boolean isAutomorphicNumber = isAutomorphicNumber(number);
        boolean isBuzzNumber = isBuzzNumber(number);

        System.out.println("Count of Digits in number: " + countOfDigits);
        System.out.println("Whether the number is a duck number or not: " + isDuck);
        System.out.println("Whether the number is an Armstrong number: " + isArmstrongNum);
        System.out.println("Largest and Second Largest elements: " + largestAndSecondLargest[0] + " and " + largestAndSecondLargest[1]);
        System.out.println("Smallest and Second Smallest elements: " + smallestAndSecondSmallest[0] + " and " + smallestAndSecondSmallest[1]);
        System.out.println("Sum of Digits of " + number + " = " + sumOfDigits);
        System.out.println("Sum of squares of the digits of " + number + " = " + sumOfSquares);
        System.out.println("Whether the number is a Harshad number or not: " + isHarshadNum);
        System.out.println("Frequency of Digits: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Frequency of " + frequencyArray[i][0] + " is " + frequencyArray[i][1]);
        }
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
        System.out.println("Are Arrays: " + Arrays.toString(digitsArray) + " and " + Arrays.toString(reversedArray) + " equal? " + areArraysEqual);
        System.out.println("Is the number a palindrome: " + isNumPalindrome);
        System.out.println("Is the number a prime number or not: " + isPrime);
        System.out.println("Is the number a neon number or not: " + isNeonNumber);
        System.out.println("Is the number a spy number or not: " + isSpyNumber);
        System.out.println("Is the number a automorphic number or not: " + isAutomorphicNumber);
        System.out.println("Is the number a buzz number or not: " + isBuzzNumber);
        // Find factors
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));

        // Find greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor of " + number + ": " + greatestFactor);

        // Find sum of factors
        int sumOfFactorsResult = sumOfFactors(factors);
        System.out.println("Sum of factors of " + number + ": " + sumOfFactorsResult);

        // Find product of factors
        int productOfFactorsResult = productOfFactors(factors);
        System.out.println("Product of factors of " + number + ": " + productOfFactorsResult);

        // Find product of cubes of factors
        double productOfCubesResult = productOfCubeOfFactors(factors);
        System.out.println("Product of cubes of factors of " + number + ": " + productOfCubesResult);

        // Check if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is " + number + " a perfect number? " + isPerfect);

        // Check if the number is an abundant number
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is " + number + " an abundant number? " + isAbundant);

        // Check if the number is a deficient number
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is " + number + " a deficient number? " + isDeficient);

        // Check if the number is a strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is " + number + " a strong number? " + isStrong);

        sc.close(); // Close the scanner
    }
}