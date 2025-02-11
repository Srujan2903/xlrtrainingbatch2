public class Demo066 {
    public static void main(String[] args) {
        // Creating an array and initializing it with some elements
        int[] array = {1, 2, 3, 4, 5};

        // Printing the elements of the array along with their index values
        printArrayWithIndices(array);
    }

    public static void printArrayWithIndices(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }
}