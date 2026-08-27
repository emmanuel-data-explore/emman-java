import java.util.Scanner;
class Rain{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Is it raining? (true/false)");
boolean rain = sc.nextBoolean();
         if(rain){
                System.out.println("Take an umbrella");
          }
          else{
                System.out.println("No need to take an umbrella");
          }
String result = rain?"Take an umbrella":"No need to take an umbrella";
System.out.println(result);
          
}
}