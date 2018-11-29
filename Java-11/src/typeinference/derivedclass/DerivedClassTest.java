package typeinference.derivedclass;

class Parent{
    void whistle() {
        System.out.println("Parent-Whistle");
    }
}

class Child extends Parent{
    void whistle() {
        System.out.println("Child-Whistle");
    }
    void stand() {
        System.out.println("Child-stand");
    }
}

public class DerivedClassTest {

    public static void main(String[] args) {
        var obj = new Child();
        obj.whistle();
        obj.stand();     // type of obj inferred as Child
    }
}
