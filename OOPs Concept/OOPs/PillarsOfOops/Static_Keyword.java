    package OOPs.PillarsOfOops;

    public class Static_Keyword{
        
        //Static variable
        static int a = 10; // This is a static variable, we use it for common properties shared by all instances of the class.
        // Instance variable
        int b = 20; // This is an instance variable

        // Static method, it's belonging to the class itself, not to any specific instance.
        // Restriciton in static method is that it cannot access instance variables or instance methods directly.
        // It can only access static variables and static methods.
        static void print() {
            System.out.println("This is a static method in class xyz.");
        }
        // Instance method,it belongs to an instance of the class.
        public void printInstance() {
            System.out.println("This is an instance method in class xyz.");
        }

        //static block
        static {
            System.out.println("This is a static block in class xyz.");
        }

        // Instance block
           {
            System.out.println("This is an instance block in class xyz.");
          }
        public static void main(String[] args) {
            // Calling the static method without creating an instance of the class
            Static_Keyword.print();
            
            //printInstance(); // This will cause an error because printInstance is not static. 
            // To call the instance method, we need to create an object of the class.
           Static_Keyword obj = new Static_Keyword();
            // Now we can call the instance method using the object
            obj.printInstance(); // Correct way to call the instance method
            // obj.print(); // This will cause an error because print is static and cannot be called on an instance.
            
        }

    }