package java_oops_concepts.programs;

public class Rectangle {
    int length,width;
    void insert(int l, int w) {
        length = l;
        width = w;
    }
    void calculateArea() {
        System.out.println(length*width);
    }
}
