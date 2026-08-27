import java.util.Scanner;
class trafficlight{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of traffic light");
        String color = sc.next();
        if (color.equalsIgnoreCase("red")){
            System.out.println("Stop");
        }
        else if(color.equalsIgnoreCase("yellow")){
            System.out.println("Get ready");
        }
        else if(color.equalsIgnoreCase("green")){
            System.out.println("Go");
        }
        else{
            System.out.println("Invalid color");
        }
    }
}