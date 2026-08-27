class vehicle{
  void  startengine(){
        System.out.println("Engine Start");
    }
}
class car extends vehicle{
   void fueltype(){
        System.out.println("Car fuel");
    }
   void startengine(){
        System.out.println("car Start engine");
    }
    void drive(){
        System.out.println("The car drives");
    }
}
class truck extends vehicle{
    void load_capacity(){
        System.out.println("Heavy load");
    }
   void startengine(){
        System.out.println("truck start engine");
    }
   void haul(){
        System.out.println("The truck is haul");
    }
}   
public class Main{
    public static void main(String[] args){
        vehicle v1 = new vehicle();
        car c1 = new car();
        truck t1 = new truck();
        t1.startengine();
        c1.startengine();
        t1.haul();
        c1.drive();
    }
}
