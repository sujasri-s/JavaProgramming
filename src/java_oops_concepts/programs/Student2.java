package java_oops_concepts.programs;

public class Student2 {
    int rollno;
    String name;
    void insertRecord(int r,String n) {
        rollno = r;
        name = n;
    }
    void displayInfo() {
        System.out.println(rollno+" "+name);
    }
}
