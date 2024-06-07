package java_oops_concepts.programs.polymorphism.methodoverloading;

// Example - Method Overloading with Type Promotion if matching found
public class OverloadingCalculation1 {
    void sum(int a,int b) {
        System.out.println("int arg method invoked");
    }
    void sum(long a,long b) {
        System.out.println("long arg method invoked");
    }

    public static void main(String[] args) {
        OverloadingCalculation1 obj = new OverloadingCalculation1();
        obj.sum(20,20);
    }
}
