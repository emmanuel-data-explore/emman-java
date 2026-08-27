 import java.util.Scanner;
 class dowhile{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        do{
            System.out.print("Enter the number > 10:");
            count = sc.nextInt();
        }while(count<10);
        
               System.out.println(count);    
        }
    }
 