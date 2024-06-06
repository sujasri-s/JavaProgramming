package java_oops_concepts;

public class TestStudent3 {
    public static void main(String[] args) {
        Student1 s3 = new Student1();
        Student1 s4 = new Student1();
        s3.id = 102;
        s3.name = "Anu";
        s4.id = 103;
        s4.name = "Vinu";
        System.out.println(s3.id+" "+s3.name);
        System.out.println(s4.id+" "+s4.name);
    }
}
