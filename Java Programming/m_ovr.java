class m_ovr{
    void sum(int a, int b){
        System.out.println("Sum of two numbers: " + (a+b));
    }
    void sum(int a, int b, int c){
        System.out.println("Sum of two numbers: " + (a+b+c));
    }
    public static void main(String[] args){
        m_ovr m1 = new m_ovr();
        m1.sum(10, 20);
        m1.sum(10, 20, 30);
    }
}
