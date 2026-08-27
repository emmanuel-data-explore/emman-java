import java.util.Scanner;
class divisible{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println("Divisible by 5 and 3");
        }
        else{
            System.out.println("Not divisible by 5 and 3");
        }
    }
}