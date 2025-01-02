public class Demo3 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // Call the method and print the result
        int greatest = findGreatest(num1, num2, num3);
        System.out.println("The greatest number is: " + greatest);
    }

    public static int findGreatest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
