package java_oops_concepts.programs.thiskeyword;

public class Hello {
    void m() {
        System.out.println("Hello m");
    }
    void n() {
        System.out.println("Hello n");
        this.m();
    }
}
