package OOps1.Q1;
public class Student{
    int age;
    String name;

    void display(){
        System.out.println("My Name is " + this.name +" I am "+ this.age + " years old.");
        
    }
    void sayHello(String say){
        System.out.println(this.name +" Says, Hello, to " + say );
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.display();
        s1.sayHello("Alice");

    }   
}