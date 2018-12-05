# Data Class
```aidl
record Emp(String name, int age) { }        // data class - one liner code
```
- The compiler automatically generates default implements for the Object methods (equals(), hashCode(), toString()) for data classes.
- The above codee is an example of non-abstract dataclass
- A non-abstract data class is implicitly final.
- A data class can also be defined as an abstract data class.
- In both cases, a data class would get default implementations of hashCode(), equals() and toString(), and accessor methods.
- For an abstract data class, the constructors would be protected.

![data-class](images/data-class.png?raw=true "data-class")

# Aggregate and Exploded form of data class
- Aggregaate Form
```aidl
record Emp(String name, int age) { }       
```
- Deconstruction pattern refers to the conversion from aggregate form to exploded form for a data class.

# Limitations of Data Class
- no finer control on whether your data class is extensible
- state is mutable
- accessibility to fields
- additional fields or multiple constructors

# Pattern matching with Data Class

# Data Class and Inheritance
- Non-abstract and abstract data classes can extend other abstract data classes
- An abstract or non-abstract data class can extend any interface(s).
![data-inheritance](images/data-inheritance.png?raw=true "data-inheritance")

# Extending abstract data class
```aidl
abstract record Emp(String name, int age); 
record Manager(String name, int age, String country) extends Emp(name, age); 
```
- A data class can extend a single abstract data class.