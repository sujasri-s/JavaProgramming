package java_oops_concepts.programs.thiskeyword;

public class Student7 {
    int rollno;
    String name,course;
    float fee;
    Student7(int rollno,String name,String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
    Student7(int rollno,String name,String course,float fee) {
        this(rollno,name,course); //reusing constructor
        this.fee = fee;
    }
    void display() {
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}
