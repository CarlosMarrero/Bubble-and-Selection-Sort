
public class Sorts {

    // array of numbers to be sorted
    public static int[] numbers = new int[15];

    // method to populate the array of numbers with random int's in the range
    // 0 to 999
    public static void populateNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.rint(Math.random() * 1000);
        }
    }

    // method to print out the array of numbers
    public static void showNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    // method to perform Bubble Sort on the array of numbers.
    public static void bubbleSort() {
        int lastSwap;
        int lastCell = numbers.length - 1;
        int temp;

        System.out.println();
        System.out.println();
        System.out.println("Beginning of Bubble Sort");
        System.out.println();
        do {
            lastSwap = 0;
            System.out.println("lastCell = " + lastCell);

            for (int i = 0; i < lastCell; i++) {

                System.out.println("Comparing " + numbers[i] + " and " + numbers[i + 1]);
                if (numbers[i] > numbers[i + 1]) {
                    System.out.println("Swapping " + numbers[i] + " and " + numbers[i + 1]);
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    lastSwap = i;
                }
                showNumbers();
            }

            System.out.println("lastSwap = " + lastSwap);
            lastCell = lastSwap;
        } while (lastCell > 0);

        System.out.println();
        System.out.println();
        System.out.println("End of Bubble Sort");
        System.out.println();
    }

    // method to perform selection sort on the array of numbers
    public static void selectionSort() {

        System.out.println();
        System.out.println();
        System.out.println("Beginning of Selection Sort");
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            int curMin = numbers[i];
            int curMinIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < curMin) {
                    curMin = numbers[j];
                    curMinIndex = j;
                }
            }

            numbers[curMinIndex] = numbers[i];
            numbers[i] = curMin;
            showNumbers();
        }

        System.out.println();
        System.out.println();
        System.out.println("End of Selection Sort");
        System.out.println();
    }

    public static void main(String[] args) {

        // populate the array of numbers
        populateNumbers();

        // sort the array of numbers
        bubbleSort();

        // populate the array of numbers
        populateNumbers();

        // sort the array of numbers
        selectionSort();
    }
}
