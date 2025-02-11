public class Demo065 {
    public static void main(String[] args) {
        // Creating an array and initializing it with some elements
        int[] array = {1, 2, 3, 4, 5};

        // Printing the elements of the array
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}