class f_para_sum{
    void sum(int a,b){
       System.out.println("The sum of two numbers is:"+(a+b));
    }
    void sub(int c, int d){
       System.out.println("The sub of two numbers is:"+(c-d));
    }
    void mul(int e, int f){
       System.out.println("The mul of two numbers is:"+(e*f));
    }
    void div(int a, int b){
       System.out.println("The div of two numbers is:"+(a/b));
    }
    public static void main(String[] args){
        f_para_sum f1 = new f_para_sum();
        f1.sum(10,20);
        f1.sub(20,10);
        f1.mul(10,20);
        f1.div(20,10); 
    }
}