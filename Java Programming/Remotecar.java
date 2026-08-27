import java.util.Scanner;
class Remotecar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("marks enna?");
        int marks = sc.nextInt();
        if (marks >90){
            System.out.println("remote car");
        }
        else if (marks >70){
            System.out.println("tip pencil");
        }
        else if (marks >50){
            System.out.println("pen");
        }
        else{
            System.out.println("serupadi");
        }
            
}
    }