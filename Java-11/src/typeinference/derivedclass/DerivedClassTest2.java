package typeinference.derivedclass;

/*class Parent {
    void whistle() {
        System.out.println("Parent-Whistle");
    }
}

class Child extends Parent {
    void whistle() {
        System.out.println("Child-Whistle");
    }
    void stand() {
        System.out.println("Child-stand");
    }
}*/

public class DerivedClassTest2 {
    public static Parent getObject(String type) {
        if (type.equals("Parent"))
            return new Parent();
        else
            return new Child();
    }

    public static void main(String[] args) {
        var obj = getObject("Child");
        obj.whistle();
        //obj.stand();              // This line doesn't compile
    }
}
