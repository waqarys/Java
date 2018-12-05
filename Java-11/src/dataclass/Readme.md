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