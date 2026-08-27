import java.util.Scanner;
import java.util.Arrays;
class array3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] score = new int[10];
        System.out.println("Enter the array elements:");
        for(int i=0;i<=9;i++){
            score[i] = sc.nextInt();
        }
         System.out.println("The index 0:"+score[0]);
         System.out.println("The index 1:"+score[1]);
         System.out.println("The scores are:");
         for(int i=0;i<=9;i++){
            System.out.println(score[i]);
        }
        System.out.println("The scores in array are:"+Arrays.toString(score));
    }
}
