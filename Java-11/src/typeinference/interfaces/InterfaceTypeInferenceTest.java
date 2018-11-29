package typeinference.interfaces;

interface MarathonRunner{
    default void run() {
        System.out.println("I'm a marathon runner");
    }
}

class Child implements MarathonRunner {
    void whistle() {
        System.out.println("Child-Whistle");
    }
    void stand() {
        System.out.println("Child-stand");
    }
}

public class InterfaceTypeInferenceTest {
    public static void main(String[] args) {
        var obj = new Child();              // inferred type of var obj is Child
        obj.whistle();
        obj.stand();
        obj.run();
    }
}
