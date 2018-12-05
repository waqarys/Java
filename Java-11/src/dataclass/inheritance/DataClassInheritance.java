package dataclass.inheritance;

abstract record Emp(String name, int age);
record Manager(String name, int age, String country) extends Emp(name, age);

public class DataClassInheritance {
}
