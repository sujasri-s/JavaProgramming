package java_oops_concepts.programs.thiskeyword;

// Example - this: to refer current class instance variable
public class TestThisKey {
    public static void main(String[] args) {
        Student6 s1 = new Student6(101,"Amal",5000f);
        Student6 s2 = new Student6(102,"Sachin",6000f);
        s1.display();
        s2.display();
    }
}
