package java_oops_concepts.programs.polymorphism.superkeyword;

public class Dog extends Animal{
    String color = "black";
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
