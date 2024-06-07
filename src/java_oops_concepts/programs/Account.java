package java_oops_concepts.programs;

public class Account {
    int acc_no;
    String name;
    float amount;
    void insert(int a, String n, float amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }
    void deposit(float amt) {
        amount+=amt;
        System.out.println(amt+" deposited");
    }
    void withdraw(float amt) {
        if (amount<amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount-=amt;
            System.out.println(amt+" withdrawn");
        }
    }
    void checkBalance() {
        System.out.println("Balance: "+amount);
    }
    void display() {
        System.out.println(acc_no+" "+name+" "+amount);
    }
}
