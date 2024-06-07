package java_oops_concepts.programs.thiskeyword;

// Example - this: to pass as an argument in the method
public class TestThisKey5 {
    void m(TestThisKey5 obj) {
        System.out.println("Method is invoked");
    }
    void p() {
        m(this);
    }

    public static void main(String[] args) {
        TestThisKey5 s1 = new TestThisKey5();
        s1.p();
    }
}
