public class soap{
    void get_soap(int money_1){
        System.out.println(money_1);
        System.out.println("Soap purchased");
    }
    void get_chocolate(int money_2){
        System.out.println(money_2);
        System.out.println("Soap purchased");
    }
    void get_powder(int money_3){
        System.out.println(money_3);
        System.out.println("powder purchased");
    }
    public static void main(String[] args){
        soap s1 =  new soap();
        s1.get_soap(20);
        s1.get_chocolate(5);
        s1.get_powder(15);
    }
}