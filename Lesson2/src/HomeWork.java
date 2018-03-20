import java.util.Random;
import java.util.Scanner;

public class HomeWork {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // Task # 1
//        System.out.println("Please input number from 2 to 9: ");
//        int stepsAsterisks = scan.nextInt();
//        printAsterisks(stepsAsterisks);
//
//
        //Task 2 & Task 4
//        System.out.println("Please input amount of loops to test array sort and binary search: ");
//        int loops = scan.nextInt();
//        for (int i = 1; i <= loops; i++) { //Tasks # 2, 3
//            int[] randomArray = new Random().ints(10, 1, 10).toArray();
//            System.out.println("-----------Unsorted---------------");
//            printArray(randomArray);
//            bubbleSort(randomArray);
//            System.out.println("-----------Sorted-----------------");
//            printArray(randomArray);
//            int searchable = (int) (9 * Math.random() + 1);
//            System.out.println("Is searchable " + searchable + " is in array - " + isInArray(randomArray, searchable));
//            System.out.println();
//        }

        //Task 5
//        System.out.println("Please input to determine whether it even or odd: ");
//        int number = scan.nextInt();
//        printOddOrEven(number);


        //Task 6
//        System.out.println("Please input number from 1 to 9 to have its string representation: ");
//        int number = scan.nextInt();
//        printStringOfNumber(number);


        //Task 7
//        printSumOfHundred();


        //Task 6(2)
        double customPI = calculateCustomPI();
        System.out.println(customPI + " " + Math.PI);
    }

    private static double calculateCustomPI() {
        double Pi = 4;
        boolean plus = false;
        for (int i = 3; i < 10000000; i += 2) {
            if (plus) {
                Pi += 4.0 / i;
            } else {
                Pi -= 4.0 / i;
            }
            plus = !plus;
        }
        return Pi;
    }

    private static void printSumOfHundred() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println("Sum is - " + result + "\nAverage is - " + (double) result / 100);
    }

    private static void printStringOfNumber(int number) {
        if (number > 0 && number < 10) {
            String[] values = {"One", "Two", "Three", "Four", "Fife", "Six", "Seven", "Eight", "Nine"};
            System.out.println(values[number - 1]);
        } else {
            System.out.println("Number is out of range");
        }

    }

    private static void printOddOrEven(int value) {
        if (value % 2 == 0) {
            System.out.println(value + " - Even number");
        } else {
            System.out.println(value + " - Odd number");
        }
    }

    private static void printAsterisks(int steps) {
        for (int i = 1; i <= steps; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int j = steps - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printArray(int[] array) {
        if (array.length > 1) {
            System.out.print("|");
        }
        for (int elem : array) {
            System.out.print(elem + "|");
        }
        System.out.println("");
    }

    private static void bubbleSort(int[] array) {
        boolean runWhile = true;
        while (runWhile) {
            int changesCount = 0;
            for (int i = 0; i < array.length - 1; i++) {
                int currValue = array[i];
                int nextValue = array[i + 1];
                if (currValue > nextValue) {
                    array[i] = nextValue;
                    array[i + 1] = currValue;
                    changesCount++;
                }
            }
            if (changesCount == 0) {
                runWhile = false;
            }
        }
    }

    private static boolean isInArray(int[] array, int searchable) {
        int upperBound = array.length - 1;
        int lowerBound = 0;
        int i = (upperBound + lowerBound) / 2;
        while (i >= lowerBound && i <= upperBound) {
            if (searchable == array[i]) {
                return true;
            } else {
                if (searchable > array[i]) {
                    lowerBound = i + 1;
                } else {
                    upperBound = i - 1;
                }
            }
            i = (upperBound + lowerBound) / 2;
        }
        return false;
    }
}
