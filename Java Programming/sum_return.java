public class sum_return{
    int sum(int a, int b){
        return a + b;
    }
    String getname(String name){
        return name;
    }

    public static void main(String[] args){
        sum_return s1 = new sum_return();
        System.out.println(s1.sum(10, 20));
        System.out.println(s1.getname("John"));
    }
}