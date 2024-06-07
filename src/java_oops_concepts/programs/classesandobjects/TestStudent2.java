package java_oops_concepts.programs.classesandobjects;

//Example - Initializing object through reference
public class TestStudent2 {
    public static void main(String[] args) {
        Student1 s2 = new Student1();
        s2.id = 101;
        s2.name = "Sonu";
        System.out.println(s2.id+" "+s2.name);
    }
}
