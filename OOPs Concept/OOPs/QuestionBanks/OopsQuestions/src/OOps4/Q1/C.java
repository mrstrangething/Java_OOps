package OOps4.Q1;

public class C implements I { 
    // Implements Keyword stands for "implements" in Java
    // Class C implements the interface I, which extends both I1 and I2.

    @Override
    public void fun() {
        System.out.println("fun() method from I1 and I2");
    }

    @Override
    public void fun1() {
        System.out.println("fun1() method from I1");
    }

    @Override
    public void fun2() {
        System.out.println("fun2() method from I2");
    }
    
}
