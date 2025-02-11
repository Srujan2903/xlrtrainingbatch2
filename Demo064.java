import java.util.ArrayList;

public class Demo064 {
    public static void main(String[] args) {
        // Creating an ArrayList and adding some elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Printing the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Swapping the first and the last elements
        swapFirstAndLast(arrayList);

        // Printing the modified ArrayList
        System.out.println("Modified ArrayList: " + arrayList);
    }

    public static void swapFirstAndLast(ArrayList<Integer> list) {
        if (list.size() > 1) {
            // Storing the first and the last elements in temporary variables
            int first = list.get(0);
            int last = list.get(list.size() - 1);

            // Swapping the elements
            list.set(0, last);
            list.set(list.size() - 1, first);
        }
    }
}