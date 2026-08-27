import java.util.Scanner;
class for2 {
    public static void main(String [] args)
    {
              //user  input vanganu
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your from num");
        int a = sc.nextInt();
        System.out.println("Enter your to num");
        int b = sc.nextInt();
        for(int i = a ; i <= b; i++)
        {
            System.out.println(i);
        }

    }
}