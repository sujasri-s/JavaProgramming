package java_oops_concepts.programs.thiskeyword;

import java_oops_concepts.programs.thiskeyword.TestThisKey6;

public class B {
    TestThisKey6 obj;
    B(TestThisKey6 obj) {
        this.obj = obj;
    }
    void display() {
        System.out.println(obj.data);
    }
}
