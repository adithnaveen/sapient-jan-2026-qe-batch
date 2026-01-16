# sapient-jan-2026-qe-batch


# Java Core Foundations & Object-Oriented Programming  
## 16-Hour Corporate Training (2 Days)

---

## Training Overview

**Audience:** Freshers / Junior Engineers / Support Engineers transitioning to Development  
**Duration:** 16 Hours (2 Days × 8 Hours)  
**Objective:** Build strong Java fundamentals with enterprise-ready OOP understanding

---

## Day 1 – Java Foundations & Core Language (8 Hours)

---

## Module 1: Java Ecosystem & Building Blocks (2 Hours)

### 1.1 Features of Java
Java is a high-level, object-oriented, platform-independent language designed for enterprise systems.

**Key Features**
- Platform Independent (WORA)
- Object-Oriented
- Robust & Secure
- Multithreaded
- Automatic Memory Management
- High Performance using JIT

```java
public class FeatureDemo {
    public static void main(String[] args) {
        System.out.println("Java executes on JVM");
    }
}
```

**Trainer Notes**
- Java compiles to bytecode
- JVM abstracts OS & hardware

**Assessment (10 mins):**
Explain why Java is platform independent and how JVM enables this.

---

### 1.2 JDK, JRE, JVM

| Component | Purpose |
|---------|---------|
| JVM | Executes bytecode |
| JRE | JVM + core libraries |
| JDK | JRE + dev tools |

```bash
javac Hello.java
java Hello
```

**Assessment:**
Differentiate JDK, JRE, JVM with deployment examples.

---

## Module 2: Class, Object & Memory Model (2 Hours)

### 2.1 Class & Package

```java
package com.company.training;

public class Trainer {
    public void teach() {
        System.out.println("Java Training");
    }
}
```

**Why Packages**
- Logical grouping
- Namespace control
- Access management

**Assessment:**
Why are packages mandatory in large Java projects?

---

### 2.2 Objects & Variables

```java
class Employee {
    int id;
    String name;
}
```

**Memory Insight**
- Objects → Heap
- Reference → Stack

**Assessment:**
Explain object creation and memory allocation.

---

### 2.3 Variable Scope

```java
class ScopeDemo {
    int instanceVar = 10;
    static int staticVar = 20;

    void show() {
        int localVar = 30;
    }
}
```

| Variable | Scope | Lifetime |
|-------|-------|---------|
| Local | Method | Method |
| Instance | Object | Object |
| Static | Class | JVM |

**Assessment:**
Compare variable scopes with lifecycle.

---

## Module 3: Operators, Control Flow & Loops (2 Hours)

### 3.1 Arithmetic Operators

```java
int a = 10, b = 3;
System.out.println(a / b);
System.out.println(a % b);
```

**Assessment:**
Explain difference between / and %.

---

### 3.2 Conditional & Looping Statements

```java
for(int i = 1; i <= 10; i++) {
    if(i % 2 == 0) {
        System.out.println(i);
    }
}
```

**Assessment:**
Write logic to print numbers divisible by 5.

---

## Module 4: Static vs Instance Members (2 Hours)

### 4.1 Static Variables, Methods & Blocks

```java
class Counter {
    static int count;

    static {
        System.out.println("Static block executed");
    }

    Counter() {
        count++;
    }
}
```

**Assessment:**
Explain static block execution order.

---

### 4.2 Instance Variables & Methods

```java
class Car {
    String model;

    void drive() {
        System.out.println(model + " driving");
    }
}
```

**Assessment:**
Why can’t instance members be accessed from static context?

---

## Day 2 – OOP, Strings & Design Principles (8 Hours)

---

## Module 5: Object Creation & Lifecycle (1 Hour)

```java
Car c = new Car();
c.model = "BMW";
c.drive();
```

**JVM Steps**
1. Class loading
2. Memory allocation
3. Constructor call

**Assessment:**
Explain object lifecycle in JVM.

---

## Module 6: Encapsulation & Abstraction (3 Hours)

### 6.1 Encapsulation

```java
class BankAccount {
    private double balance;

    public void deposit(double amt) {
        balance += amt;
    }

    public double getBalance() {
        return balance;
    }
}
```

**Benefits**
- Data security
- Controlled access
- Maintainability

**Tight Encapsulation**
- All variables private
- Access via methods

**Assessment:**
Explain tight encapsulation with real-world example.

---

### 6.2 Abstraction

```java
abstract class Payment {
    abstract void pay();
}

class CardPayment extends Payment {
    void pay() {
        System.out.println("Card payment");
    }
}
```

**Assessment:**
Differentiate abstraction and encapsulation.

---

## Module 7: String Handling (2 Hours)

### String Creation

```java
String s1 = "Java";
String s2 = new String("Java");
```

### String Manipulation

```java
String name = "Java";
System.out.println(name.concat(" Training"));
```

**Key Points**
- Immutable
- Stored in String Pool

**Assessment:**
Why are Strings immutable in Java?

---

## Module 8: Design Patterns & OOP Advanced (2 Hours)

### Singleton Design Pattern

```java
class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```

**Use Cases**
- Logging
- Configuration
- DB connection

**Assessment:**
Where can Singleton cause issues?

---

## Module 9: Method Overloading (1 Hour)

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

```java
void test(int a) {}
void test(Integer a) {}
```

**Assessment:**
Explain compile-time polymorphism.

---

## Module 10: Inheritance (1 Hour)

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

**Key Points**
- IS-A relationship
- Code reuse
- Polymorphism

**Topmost Class**
`java.lang.Object`

**Assessment:**
Why is Object the root class in Java?




## in class discussion 

- access specifiers - public private protected default 
- access modifiers - static void final synchronize 


### to explore 
- jdeps, jmap, jheap etc 
- look for EJB  

### exploring helloworld 
- java/lang/Object
- java/lang/System
- java/io/PrintStream
- println
- java/lang/String
- Hello World

- https://docs.oracle.com/javase//7/docs/api/overview-summary.html




### variable conventions 
- packages - lower case, seperate with . 
- class name - pascal case - EmployeeSalary, BusinessLogic 
- variable, method - camel case - empId, processSalary() 
- constancts - final - UPPER CASE 


### Access Specifiers 

- private variables/methods  are accessed only in the class 
- default variables / methods can be accessed within the package inhe or not inhe 
- protected variables / methods can be accessed outside the package only if they are inherited 
- public scope can be accessed any where  


### variable scope 

```
    {
        declare variable 1
        {
            declare variable 2
        }

        {
            1 is visbile and available 
            2 is no available not visible 
        }
    }
```