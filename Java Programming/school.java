import java.util.Scanner;
public class school{
    void  passorfail(int marks){
            if(marks >= 35){
                System.out.println("you have passed");
            }
            else{
                System.out.println("you have failed");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        school s1 = new school();
        s1.passorfail(marks);
        
    }
}