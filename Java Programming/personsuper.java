class Person{
    String name;  //indha name ahh ref pananu na this.name
    void Person(String name){
        this.name = name;
    }
}
class employee{
    void Employee(String name){
        super(name);
    }
}
public class personsuper{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.Employee("John");
    }
}