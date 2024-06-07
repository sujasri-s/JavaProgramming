package java_oops_concepts.programs.methods;

// Example - creating multiple objects by one type only
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(), r2 = new Rectangle();
        r1.insert(11,5);
        r2.insert(12,5);
        r1.calculateArea();
        r2.calculateArea();
    }
}
