# What is TypeInference ?
`Type inference is the capability of compiler to determine the type of the data, by using the information that is already available in the code; literal values, method invocations and their declaration. For a developer, type inference reduces verbosity`

**Type Inference with var**
```
var name = "Java11";         // variable 'name' inferred as String
var dateTime = new LocalDateTime.now();  // var 'dateTime' inferred as LocalDateTime
```
- `var` cannot be left uninitialised. e.g., var x; var x=null. The code won't compile.
- The following code won't work. var can't be used to catch exceptions.
```
class Foo {
    public static void main(String   args[]) {
        try {
           char[] name = new char[]{'S','t','r','i','n','g'};
           for (var c : name) {
               System.out.println(c + ":"   + (c + 1 - 1));
           }
        }
        catch (var e) {
            //code
        }
    }
}
```

**var with Primitive data types**
```
var counter = 9_009_998_992_887;       // code doesn't compile
var counter = 9_009_998_992_887L;       // code compiles
var aChar = (char)91;                   // code compiles
```

```
// type of result inferred as int; 'result' stores 2
var divResult = 5/2;

// result of (5/2), that is 2 casted to a double; divResult stores 2.0
var divResult = (double)(5/ 2);

// operation of a double and int results in a double; divResult stores 2.5
var divResult = (double)5/ 2;
```

- Arithmetic operation
- In an arithmetic operation, if either of the operand is char, byte, short or int, the result is at least promoted to an int.
```
byte b1 = 10;
char c1 = 9;
var sum = b1 + c1;        // inferred type of sum is int
```

```
byte cupsOfCoffee = 10;
long population = 10L;
float weight = 79.8f;
double distance = 198654.77;

var total1 = cupsOfCoffee + population;     // inferred type of total1 is long
var total2 = distance + population;        // inferred type of total2 is double
var total3 = weight + population;    // inferred type of total3 is float
```

# Type Inference with derived classes
`child` class extends `parent` class. When you create a local variable and assign it an instance of the Child class, the type of the variable is inferred as Child.
```
class Parent {
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
}
class Test{
    public static void main(String[] args) {
        var obj = new Child();
        obj.whistle();
        obj.stand();     // type of obj inferred as Child
    }
}
```
- Refer to `DerivedClassTest2`. The code won't compile.
`Type of variables defined using var are inferred at compile time.
If the return type of a method is used to assign a variable defined using var, its inferred type is the return type of the method; not the type of instance returned during run time.`

# Type Inference with Interfaces
- `InterfaceTypeInferenceTest.java`

# Using var with Arrays
```
var name = new char[]{'S','t','r','i','n','g'};
```
![var-array](resources/images/typeinference/ivar-array.jpg?raw=true "var-array")
