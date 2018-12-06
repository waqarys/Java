package dataclass.inheritance;

interface Organizer {
}

interface Speaker {
    abstract void conferenceTalk();
}

    abstract record Emp(String name, int age);

    record Manager(String name, int age, String country)
   extends Emp(name,age)
           implements Organizer;

public class InterfaceExample (String name,int age,String programmingLang)
        extends Emp(name,age)
        implements Organizer,Speaker{
public void conferenceTalk(){
        //.. code
        }
        };
