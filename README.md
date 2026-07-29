# Java Star Patterns

This repository contains a collection of Java programs that print various star and number patterns. Each pattern is implemented as an individual Java class inside the `StarPatterns` package.

## Package Structure

All pattern classes are located in:

```
StarPatterns/
```

Each class begins with the package declaration:

```java
package StarPatterns;
```

This allows the classes to be imported and used from any Java program, for example:

```java
import StarPatterns.*;

public class Main {
    public static void main(String[] args) {
        SquareFillPattern.printPattern(5);
    }
}
```

---

## Available Pattern Classes

| Class Name | Description |
|------------|-------------|
| `DiamondPattern` | Prints a diamond star pattern. |
| `GapTriangleNumbers` | Prints a triangle of numbers with gaps between values. |
| `KPattern` | Prints the alphabet K-shaped star pattern. |
| `LeftTrianglePyramid` | Prints a left-aligned triangle pyramid. |
| `MirrorImageTrianglePattern` | Prints the mirror image of a right triangle. |
| `NumberChangingPyramidPattern` | Prints a pyramid with continuously changing numbers. |
| `NumberIncreasingPyramidPattern` | Prints a pyramid with increasing numbers on each row. |
| `NumberIncreasingreversePyramidPattern` | Prints an inverted pyramid with increasing numbers. |
| `NumberTrianglePattern` | Prints a triangular number pattern. |
| `PalindromeTrianglePattern` | Prints a palindromic number triangle. |
| `PascalsTrianglePattern` | Prints Pascal's Triangle. |
| `ReverseLeftTrianglePyramid` | Prints an inverted left-aligned triangle. |
| `ReverseNumberTrianglePattern` | Prints an inverted number triangle. |
| `ReverseRightTrianglePyramid` | Prints an inverted right-aligned triangle. |
| `RhombusPattern` | Prints a rhombus star pattern. |
| `RightTrianglePyramid` | Prints a right-aligned triangle pyramid. |
| `SquareFillPattern` | Prints a solid square pattern. |
| `SquareHollowPattern` | Prints a hollow square pattern. |
| `TriangleStarPattern` | Prints a basic star triangle. |
| `ZeroOneTrianglePattern` | Prints a triangle consisting of alternating 0s and 1s. |

---

## Project Structure

```
Project/
│
├── Main.java
│
└── StarPatterns/
    ├── DiamondPattern.java
    ├── GapTriangleNumbers.java
    ├── KPattern.java
    ├── LeftTrianglePyramid.java
    ├── MirrorImageTrianglePattern.java
    ├── NumberChangingPyramidPattern.java
    ├── NumberIncreasingPyramidPattern.java
    ├── NumberIncreasingreversePyramidPattern.java
    ├── NumberTrianglePattern.java
    ├── PalindromeTrianglePattern.java
    ├── PascalsTrianglePattern.java
    ├── ReverseLeftTrianglePyramid.java
    ├── ReverseNumberTrianglePattern.java
    ├── ReverseRightTrianglePyramid.java
    ├── RhombusPattern.java
    ├── RightTrianglePyramid.java
    ├── SquareFillPattern.java
    ├── SquareHollowPattern.java
    ├── TriangleStarPattern.java
    └── ZeroOneTrianglePattern.java
```

---

## Compilation

Compile all pattern classes:

```bash
javac StarPatterns/*.java
```

Compile the entire project:

```bash
javac Main.java StarPatterns/*.java
```

Run the main class:

```bash
java Main
```

---

## Purpose

This project is intended for:

- Learning nested loops in Java
- Practicing pattern-printing problems
- Preparing for coding interviews
- Understanding the use of Java packages and classes
- Demonstrating different geometric and numerical pattern algorithms
