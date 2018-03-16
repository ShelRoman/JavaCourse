import java.util.Random;
import java.util.TreeMap;

public class HomeWork {


    public static void main(String[] args) {
        printAsterisks(7);
        for (int i = 0; i < 5; i++) {
            int[] randomArray = new Random().ints(10, 1, 10).toArray();
            System.out.println("-----------Unsorted---------------");
            printArray(randomArray);
            bubbleSort(randomArray);
            System.out.println("-----------Sorted-----------------");
            printArray(randomArray);
            int searchable = (int) (9 * Math.random() + 1);
            System.out.println(isInArray(randomArray, searchable) + " searchable - " + searchable);
            System.out.println();
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
        for (int elem : array) {
            System.out.print(elem + " ");
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
        int upperBorder = array.length - 1;
        int lowerBorder = 0;
        int i = (upperBorder + lowerBorder) / 2;
        while (i >= lowerBorder && i <= upperBorder) {
            if (searchable == array[i]) {
                return true;
            } else {
                if (searchable > array[i]) {
                    lowerBorder = i + 1;
                } else {
                    upperBorder = i - 1;
                }
            }
            i = (upperBorder + lowerBorder) / 2;
        }
        return false;
    }
}
