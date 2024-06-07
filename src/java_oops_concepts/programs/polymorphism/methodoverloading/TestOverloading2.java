package java_oops_concepts.programs.polymorphism.methodoverloading;

// Example - main method overloading
public class TestOverloading2 {
    public static void main(String[] args) {
        System.out.println("main with String[]");
    }

    public static void main(String args) {
        System.out.println("main with String");
    }

    public static void main() {
        System.out.println("main without args");
    }
}
