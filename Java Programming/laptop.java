public class laptop{
    String name = "unknown";
    String proc = "unknown";
    int ram = 0;
    int price = 0;
    public static void main(String args[]){
        laptop  l1 = new laptop();
        l1.name = "lenovo";
        l1.proc = "i5";
        l1.ram = 6 ;
        l1.price = 15000;
        laptop  l2 = new laptop();
        l2.name = "hp";
        l2.proc = "amd";
        l2.ram = 8 ;
        l2.price = 20000;
        laptop l3 = new laptop();
        System.out.println(l1.ram);
        System.out.println(l2.price);
        System.out.println(l1.proc);
        System.out.println(l3.ram);
    }
    }
