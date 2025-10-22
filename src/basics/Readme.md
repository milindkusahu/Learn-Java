# Java Basic To Advance

## 1. Introduction

### Data Types in Java:
![data-types.png](../images/data-types.png)

### Data Types Implicit Conversion:

![implicit-conversion.png](../images/implicit-conversion.png)

---
## 2. Java Operators & Binary Number System + Taking User Input

Agenda:
- Binary Number System
- Operators in Java
- Taking User Input

### Binary Number System

#### Convert Decimal To Binary

![decimal-to-binary.png](../images/decimal-to-binary.png)

#### Convert Binary To Decimal

![binary-to-decimal.png](../images/binary-to-decimal.png)

Memorize It:
2^0 = 1  
2^1 = 2  
2^2 = 4  
2^3 = 8  
2^4 = 16  
2^5 = 32  
2^6 = 64  
2^7 = 128  
2^8 = 256  
2^9 = 512  
2^10 = 1024

#### Binary Addition

![binary-addition.png](../images/binary-addition.png)

#### Binary Subtraction

![binary-subtraction.png](../images/binary-subtraction.png)

### Types of Operators in Java

1. Arithmetic Operators
2. Assignment Operators
3. Relational Operators
4. Logical Operators
5. Unary Operators
6. Bitwise Operators

#### Arithmetic Operators

+ -> Addition
- -> Subtraction
* -> Multiplication
/ -> Division
% -> Modulo Operation (Remainder after division)

#### Assignment Operators

![assignment-operators.png](../images/assignment-operators.png)

#### Relational Operators

![relational-operators.png](../images/relational-operators.png)

#### Logical Operators

![logical-operators.png](../images/logical-operators.png)

#### Bitwise Operators

![bitwise-operators.png](../images/bitwise-operators.png)

#### Other Operators

- Increment/ Decrement Operators

a++ -> a = a + 1
a-- -> a = a - 1

- Ternary Operators

a > 1 ? true : false

### Taking User Input using Scanner

- In order to use the object of Scanner, we need to import java.util.Scanner package.
- Scanner is a predefined class in Java.

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

#### Various Input Types using Scanner

- We can use nextLong(), nextFloat(), nextDouble(), and next() methods to get long, float, double, and string input respectively from the user.

Note: It is recommended to close the scanner object once the input is taken using the close() method.

---
## 3. Conditional Statements

1. if-else statement
2. if-else if- else statement
3. Nested if-else statement
4. Working with the Logical Operators 
5. Ternary Operator
6. Switch statement

### if-else statement

```java
if (condition) {
    // code to execute if condition is true
} else {
    // code to execute if condition is false
}
```

---

### if-else if-else statement

```java
if (condition1) {
    // code if condition1 is true
} else if (condition2) {
    // code if condition2 is true
} else {
    // code if all conditions are false
}
```

---

### Nested if-else statement

```java
if (condition1) {
    if (condition2) {
        // code if both conditions are true
    } else {
        // code if condition1 is true but condition2 is false
    }
} else {
    // code if condition1 is false
}
```

---

### Working with Logical Operators

```java
if (a > b && b > c) {
    // AND operator
}

if (x == 10 || y == 20) {
    // OR operator
}

if (!(x > y)) {
    // NOT operator
}
```

---

### Ternary Operator

```java
variable = (condition) ? expression1 : expression2;
```

---

### Switch statement

```java
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // default code block
}
```

---
## 4. Loops

1. for loop
2. while loop
3. do-while loop
4. break & continue statements
5. Nested loops
6. Labeled break & continue statements

### for loop

```java
for (initialization; condition; update) {
    // code to be executed
}
```

---

### while loop

```java
while (condition) {
    // code to be executed
}
```

---

### do-while loop

```java
do {
    // code to be executed
} while (condition);
```

---

### break & continue statements

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // exits the loop
    }
    if (i % 2 == 0) {
        continue; // skips to the next iteration
    }
}
```

---

### Nested loops

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        // code to be executed
    }
}
```

---

### Labeled break & continue statements

```java
outerLoop:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (j == 1) {
            break outerLoop; // exits the outer loop
        }
    }
}

outerLoop:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (j == 1) {
            continue outerLoop; // skips to the next iteration of outer loop
        }
    }
}
```

