package java_oops_concepts.programs.polymorphism.superkeyword;

public class Dog1 extends Animal1{
    void eat() {
        System.out.println("eating bread...");
    }
    void bark() {
        System.out.println("barking...");
    }
    void work(){
        super.eat();
        bark();
    }
}
