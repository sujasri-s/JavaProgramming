package java_oops_concepts.programs.methods;

// Example - Initializing object through method
public class TestStudent4 {
    public static void main(String[] args) {
        Student2 s5 = new Student2();
        Student2 s6 = new Student2();
        s5.insertRecord(111,"Kavya");
        s6.insertRecord(112,"Navya");
        s5.displayInfo();
        s6.displayInfo();
    }
}
