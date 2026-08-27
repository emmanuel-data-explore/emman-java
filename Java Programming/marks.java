import java.util.Scanner;
class marks{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
    if (marks<=100 && marks>=0){
        if(marks>=90){
            System.out.println("A+");
        }
        else if(marks>=70){
            System.out.println("B+");
        }
        else if(marks>=50){
            System.out.println("C+");
        }
        else{
            System.out.println("Fail");
        }
    }
    else{
        System.out.println("Olunga marks podra");
    }
}
}