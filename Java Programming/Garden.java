public class Garden{
    int apple_price = 20;
    int apple_count = 5;
    void total_money(){
        System.out.println("The total price:"+(apple_price*apple_count));

    }
    public static void main(String[] args){
        Garden g1 = new Garden();
        g1.total_money();
    }
}