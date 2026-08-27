import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String a = sc.nextLine();
        System.out.println("Enter age");
        int b = sc.nextInt();
        System.out.println("The name is"+a);
        System.out.println("The age is"+b);
    }
}
