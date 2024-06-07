package java_oops_concepts.programs.polymorphism.methodoverloading;

// Example - Method Overloading: changing no. of arguments
public class TestOverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}
