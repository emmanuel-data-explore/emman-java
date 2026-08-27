public class Teacher{
    String name = null;
    
        public Teacher()
        {
            System.out.println("Hello");
        }
        void setname(String name)
        {
            this.name = name;
            //this podala na specify aagama null nu kaatum
        }
    
    public static void main(String[] args){
        Teacher t1 = new Teacher();
        t1.setname("marks");
        System.out.println(t1.name);

        }
    }