import java.util.Scanner;
public class find{
    void  evenorodd(int num){
         if(num % 2 == 0){
            System.out.println(num + " is an even number");
         }
         else{
            System.out.println(num + " is an odd number");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        find f1 = new find();
        f1.evenorodd(num);
    }
}
