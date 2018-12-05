package enums;

enum Size <T extends Measurement> {      // enum with type parameter
    SMALL(new Small()),
    MEDIUM(new Medium()),
    LARGE(new Large());

    private T mObj;

    Size(T obj) {
        mObj = obj;
    }
    T getMeasurement() {
        return mObj;
    }
}

public class EnumGenerics {

    public static void main(String args[]) {
        var large = Size.LARGE;
        System.out.println(large.getMeasurement().getLength());

    }
}
