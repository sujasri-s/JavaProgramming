package java_oops_concepts.programs.thiskeyword;

public class TestThisKey6 {
    int data = 10;
    TestThisKey6() {
        B b = new B(this);
        b.display();
    }

    public static void main(String[] args) {
        TestThisKey6 a = new TestThisKey6();
    }
}
