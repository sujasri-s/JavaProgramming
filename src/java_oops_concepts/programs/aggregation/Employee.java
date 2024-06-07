package java_oops_concepts.programs.aggregation;

public class Employee {
    int id;
    String name;
    Address address;
    public Employee(int id,String name,Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display() {
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country+" "+address.pincode);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Salem","Tamilnadu","India",636008);
        Address address2 = new Address("Bengaluru","Karnataka","India",560035);
        Employee e1 = new Employee(111,"Suja",address1);
        Employee e2 = new Employee(112,"Pravin",address2);
        e1.display();
        e2.display();
    }
}
