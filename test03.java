import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to send greetings? (yes/no): ");
        String reply = sc.nextLine();
        for (int i = 0; i < 1; i++) {
        if (reply.equals("yes")) {
            System.out.println("Happy Sankranti to all participants!");
        }
        else if(reply.equals("no")){
            break;
        }
        sc.close();
    }
    }
}