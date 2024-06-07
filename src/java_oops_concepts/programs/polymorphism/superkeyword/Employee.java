package java_oops_concepts.programs.polymorphism.superkeyword;

public class Employee extends Person{
    float salary;
    Employee(int id,String name,float salary) {
        super(id,name);
        this.salary = salary;
    }
    void display() {
        System.out.println(id+" "+name+" "+salary);
    }
}
