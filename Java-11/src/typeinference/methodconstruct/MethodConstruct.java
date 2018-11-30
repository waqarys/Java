package typeinference.methodconstruct;

interface MarathonRunner {
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

public class MethodConstruct {

    public static void main(String[] args) {
        var aRunner = new Child();         // Inferred type is Child
        start(aRunner);    // ok to pass it to start (param - MarathonRunner)
    }
    public static void start(MarathonRunner runner) {
        runner.run();
    }
}
