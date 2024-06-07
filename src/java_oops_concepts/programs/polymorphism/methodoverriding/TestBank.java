package java_oops_concepts.programs.polymorphism.methodoverriding;

public class TestBank {
    public static void main(String[] args) {
        SBIBank s = new SBIBank();
        ICICIBank i = new ICICIBank();
        AXISBank a = new AXISBank();
        System.out.println(s.getRateOfInterest());
        System.out.println(i.getRateOfInterest());
        System.out.println(a.getRateOfInterest());
    }
}
