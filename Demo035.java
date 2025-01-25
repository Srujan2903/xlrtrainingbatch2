import java.util.Scanner;
public class Demo035{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter the Second Number:");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.print(num1+ " is greater than "+num2);        
        }
        else if(num2 > num1){
            System.out.print(num2+ " is greater than "+num1);
        }else{
            System.out.println("The both number are equal");
        }
    }
}