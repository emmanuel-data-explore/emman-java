import java.util.Scanner;
class loan{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary");
        int salary = sc.nextInt();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (salary > 25000 || age > 21){
            System.out.println("You are eligible for loan");
        System.out.println("Enter the loan amount");
        int loan = sc.nextInt();
        if (loan < 500000){
            System.out.println("Loan approved");
        }
        else {
            System.out.println("Loan not approved");
        }  
        }
        else{
            System.out.println("You are not eligible for loan");
        }
    }
}