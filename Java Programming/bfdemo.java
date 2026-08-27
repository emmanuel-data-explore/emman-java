import java.util.Scanner;
class Bfdemo{

    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1==s2);
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3==s4); //comparing reference variables
        System.out.println(s3.equals(s4)); //comparing values
}
}