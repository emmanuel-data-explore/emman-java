//derieved class acquires the properties of base class is called inheritance multiple classes irukum
//types 1.single 2.multiple 3.multilevel 4.hierarchial 5.hybrid
class animal{
    String name;
    int age;
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class dog extends animal{
    String breed;
    void sound(){
        System.out.println("dog bsrks");
    }
    void fetch(){
        System.out.println("Dog is fetching");
    }


}
class cat extends animal{
    String color;
    void climb(){
        System.out.println("cat is climbing");
    }
}
public class mainanimal{
    public static void main(String[] args){
        animal a1 = new animal();
        dog d1 = new dog();
        d1.name = "Tommy";
        d1.age = 2;
        d1.breed = "kombai";
        cat c1 = new cat();
        c1.name = "Pinky";
        c1.color = "White";
        d1.sound();
        c1.sound();
        c1.climb();
}
}