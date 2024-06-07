package java_oops_concepts.programs.polymorphism.methodoverloading;

public class Adder {
    static int add(int a,int b) {
        return a+b;
    }
    static int add(int a,int b,int c) {
        return a+b+c;
    }
}
