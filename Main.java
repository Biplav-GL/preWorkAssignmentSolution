import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    // function to checkPalindrome

    public void checkPalindrome() {

        // Declarations
        int remainder, sum = 0, temp, checkPalindroneNumber;

        // Getting the input from the User
        System.out.println("Enter the Number which you want to check for Palindrone");
        checkPalindroneNumber = sc.nextInt();

        // Logic for Validating a Pallindrone Number
        temp = checkPalindroneNumber;
        while (checkPalindroneNumber > 0) {
            remainder = checkPalindroneNumber % 10;
            sum = (sum * 10) + remainder;
            checkPalindroneNumber = checkPalindroneNumber / 10;
        }
        if (temp == sum)
            System.out.println("Result: " + temp + " is a palindrome number ");
        else
            System.out.println("Result: " + temp + " is not a palindrome number ");
    }

    // function to printPattern

    public void printPattern() {

        // Declarations
        int patternNumber, i, j;

        // Getting the input from the User
        System.out.println("Enter the Number for which you want to execute the Print Pattern");
        patternNumber = sc.nextInt();

        // Logic to print the Pattern
        for (i = patternNumber; i >= 1; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }

    // function to check no is prime or not

    public void checkPrimeNumber() {

        // Declarations
        int i, flag = 0, checkPrimeNumber;

        // Getting the input from the User
        System.out.println("Enter the Number which you want to check for Prime");
        checkPrimeNumber = sc.nextInt();

        // Logic to Check the Prime Number
        if (checkPrimeNumber == 0 || checkPrimeNumber == 1) {
            System.out.println("Result: " + checkPrimeNumber + " is not prime number");
        } else {
            for (i = 2; i <= checkPrimeNumber / 2; i++) {
                if (checkPrimeNumber % i == 0) {
                    System.out.println("Result: " + checkPrimeNumber + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Result: " + checkPrimeNumber + " is prime number");
            }
        }
    }

    // function to print Fibonacci Series

    public void printFibonacciSeries() {

        //Declarations
        int n3, inputFibonacciNumber, first = 0, second = 1; // initialize the first and second value as 0,1 respectively.

        // Getting the input from the User
        System.out.println("Enter the Number for which you want to print Fibonacci Series");
        inputFibonacciNumber = sc.nextInt();

        //Logic to print the Fibonacci Series
        System.out.print(first + " " + second);
        for (int i = 2; i < inputFibonacciNumber; ++i) {
            n3 = first + second;
            System.out.print(" " + n3);
            first = second;
            second = n3;
        }

    }

    // main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("\n" + "======================================================\n"
                    + "Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n"
                    + "======================================================\n");

            System.out.println();

            choice = sc.nextInt();

            switch (choice) {

                case 0:

                    choice = 0;

                    break;

                case 1: {

                    obj.checkPalindrome();

                }

                    break;

                case 2: {

                    obj.printPattern();

                }

                    break;

                case 3: {

                    obj.checkPrimeNumber();

                }

                    break;

                case 4: {

                    obj.printFibonacciSeries();

                }

                    break;

                default:

                    System.out.println("Invalid choice. Enter a valid no.\n");

            }

        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }

}
