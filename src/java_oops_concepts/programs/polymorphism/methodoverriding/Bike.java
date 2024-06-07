package java_oops_concepts.programs.polymorphism.methodoverriding;

// Example - method overriding
public class Bike extends Vehicle{
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
