package typeinference.interfaces;

public class InterfaceTypeInferenceTest1 {
    public static MarathonRunner getObject() {
        return new Child();
    }
    public static void main(String[] args) {
        var obj = getObject();     // inferred type of var obj is MarathonRunner
        //obj.whistle();            // code won't compile
        //obj.stand();              // code won't compile
        obj.run();
    }
}
