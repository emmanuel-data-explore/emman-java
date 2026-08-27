class Student{
    int marks;
    String name;
    Student(int a, String b){
    marks = a;
    name = b;
       }

public static void main(String[] args){
          Student s1 = new Student(90,"Ravi");
          Student s2 = new Student(85,"Varma"); 
          System.out.println(s1.marks);
}
}