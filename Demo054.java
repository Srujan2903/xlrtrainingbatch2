import java.util.Scanner;

class Customer {
    String Cust_Name = "Srujan";
    long Account_no = 123456;
    Double Balance = 10000.00;

    void accept_details() {
        System.out.println("Enter your name and account number:");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_no = sc.nextLong();
        
    }

    void display_details() {
        System.out.println("Hello " + Cust_Name);
        System.out.println("Your balance is " + Balance);
    }
}

class Employee {
    String Emp_Name = "Varshith";
    long Emp_Id = 123456;
    Double Salary = 35000.00;

    void accept_details() {
        System.out.println("Enter your name and Employee ID:");
        Scanner sc = new Scanner(System.in);
        Emp_Name = sc.nextLine();
        Emp_Id = sc.nextLong();
        
    }

    void display_details() {
        System.out.println("Hello " + Emp_Name);
        System.out.println("Your salary is " + Salary);
    }
}

public class Demo054 {
    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.accept_details();
        obj.display_details();

        Employee object = new Employee();
        object.accept_details();
        object.display_details();
    }
}
