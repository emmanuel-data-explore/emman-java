import java.util.Scanner;
class Greaternumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        
        String result = (num1 > num2) ? "The greater number is: " + num1 : "The greater number is: " + num2;
        System.out.println(result);
    }}