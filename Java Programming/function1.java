public class function1 {

    static void greeting() {
        System.out.println("Vanakkam");
        function1 f1 = new function1();
        f1.dummy();
    }

    void dummy() {
        System.out.println("i am dummy");
    }

    public static void main(String args[]) {
        greeting();
    }
}