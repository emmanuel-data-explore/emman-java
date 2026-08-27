public class soap_return{
    int get_soap(int money_1){
        return 100 - money_1;
    }

    public static void main(String[] args){
        soap_return s1 =  new soap_return();
        int remaining_money = s1.get_soap(20);
        System.out.println(remaining_money);
    }
}