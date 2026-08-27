class Animalsuper{
    void Animalsuper(String name){
        System.out.println("Animal");
    }
}
class dog extends Animalsuper{
    void dog(){
        super("Monkey");
        System.out.println("dog");
    }
}
public class Mainsuper{
    public static void main(String[] args){

        dog d1 = new dog();
        d1.dog();
    }
}