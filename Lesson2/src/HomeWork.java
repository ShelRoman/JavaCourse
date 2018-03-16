import java.util.Random;

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
