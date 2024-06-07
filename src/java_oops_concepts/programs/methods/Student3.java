package java_oops_concepts.programs.methods;

// Exmaple - Accessor and Mutator methods
public class Student3 {
    private int roll;
    private String name;
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Roll: "+roll);
        System.out.println("Name: "+name);
    }

    public static void main(String[] args) {
        Student3 s7 = new Student3();
        s7.setRoll(201);
        s7.setName("Diya");
        System.out.println(s7.getRoll());
        System.out.println(s7.getName());
        s7.display();
    }
}
