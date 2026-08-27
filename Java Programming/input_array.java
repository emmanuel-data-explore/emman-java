import java.util.Scanner;
import java.util.Arrays;
    class input_array{
        public static void main(String args[]){
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter the size of array");
                        int size = sc.nextInt();
                        int[] marks = new int[size];
                        System.out.println("Enter the elements of array");

                        for(int i=0;i<size;i++){
                            marks[i] = sc.nextInt();
                        }
                        System.out.println("the array is:"+ Arrays.toString(marks));
        }
    }
