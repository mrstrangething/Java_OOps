package OOPs.PillarsOfOops.AccessModifier;

public class accessModifier {
    // Access modifiers are keywords that set the accessibility (visibility) of classes, methods, and other members.
    // There are four types of access modifiers in Java:
    // 1. public: The member is accessible from any other class.
    // 2. private: The member is accessible only within its own class.
    // 3. protected: The member is accessible within its own package and by subclasses.
    // 4. default (no modifier): The member is accessible only within its own package.

    public String publicVariable = "I am a public variable"; // Accessible everywhere
    private String privateVariable = "I am a private variable"; // Accessible only within this class
    protected String protectedVariable = "I am a protected variable"; // Accessible within the package and subclasses
    String defaultVariable = "I am a default variable"; // Accessible only within the package

    public void display() {
        System.out.println(publicVariable);
        System.out.println(privateVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
    }

    public static void main(String[] args) {
        accessModifier obj = new accessModifier();
        obj.display(); // Calling the display method to show all variables
    }
    // Note: To access private and protected members from outside the class, you need to use inheritance or getter/setter methods.
}
