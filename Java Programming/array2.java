import java.util.Scanner;
import java.util.Arrays;
class array2{
    public static void main(String[] args){
    int [] score = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the scores");
    score [0] = sc.nextInt();
    score [1] = sc.nextInt();
    score [2] = sc.nextInt();
    score [3] = sc.nextInt();
    score [4] = sc.nextInt();
    System.out.println(score[0]+score[1]+score[3]+score[3]+score[4]);
    System.out.println(Arrays.toString(score));
}}