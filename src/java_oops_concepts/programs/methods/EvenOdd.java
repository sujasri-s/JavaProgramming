package java_oops_concepts.programs.methods;

import java.util.Scanner;

//user-defined method
public class EvenOdd {
    static void findEvenOdd(int n) {
        if (n%2==0) {
            System.out.println("Even");
        } else  {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        findEvenOdd(num);
        System.out.println(Math.max(8,2)); //predefined method
    }
}
