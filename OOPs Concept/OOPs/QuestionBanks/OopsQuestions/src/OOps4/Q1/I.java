package OOps4.Q1;

public interface I extends I1, I2 {

    // Extends Keyword stands for "extends" in Java
    // Interface I extends both I1 and I2, inheriting their methods.

    //difference between extends and implements in Java:
// - "extends" is used for interfaces and classes to inherit methods and properties.    
// - "implements" is used by classes to implement interfaces, providing concrete method definitions.
// - A class can implement multiple interfaces, but can only extend one class.
// - An interface can extend multiple interfaces, allowing for a form of multiple inheritance in Java.
// - A class that implements an interface must provide concrete implementations for all methods defined in the interface.

    // This interface combines the methods from both I1 and I2
    // No additional methods are defined here, as it inherits from both interfaces.
    
    // The methods fun() from both interfaces will be inherited,
    // and the implementing class must provide implementations for all methods. 
    
}
