package java_oops_concepts.programs;

public class MyClass extends Demo{
    void display() {
        System.out.println("Abstract method?");
    }

    public static void main(String[] args) {
        Demo obj = new MyClass();
        obj.display();
    }
}
