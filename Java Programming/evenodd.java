import java.util.Scanner;
class evenodd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num > 0){
            if(num%2==0){
                System.out.println("Even number poositive");
            }
            else{
                System.out.println("Odd number positive");
            }
        }
        else{
            System.out.println("Zero or negative number");
        }
    }
}