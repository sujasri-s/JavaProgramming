package java_oops_concepts.programs.thiskeyword;

public class Hello1 {
    Hello1() {
        System.out.println("Hello a");
    }
    Hello1(int x) {
        this();
        System.out.println(x);
    }
}
