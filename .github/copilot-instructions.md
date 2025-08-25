# Copilot Coding Agent Instructions for Lee_Gore_HelloWorld

## Project Overview
This is a simple Java project consisting of a single class, `HelloWorld`, located in `Helloworld.java`. The project demonstrates basic object-oriented programming concepts, including constructors, method overloading, and encapsulation.

## Architecture & Structure
- **Single-Class Design:** All logic resides in `Helloworld.java`. There are no additional packages, modules, or external dependencies.
- **Main Method:** The entry point is the `main` method in `HelloWorld`, which demonstrates all class features.
- **Fields & Methods:**
  - `private String name` and `private int age` store instance data.
  - Two constructors: one for name only, one for name and age.
  - `greet()` and overloaded `greet(String customMessage)` for greetings.
  - `introduce()` for self-introduction.

## Developer Workflows
- **Build & Run:**
  - Compile: `javac Helloworld.java`
  - Run: `java HelloWorld`
  - No build scripts or automation; manual compilation is standard.
- **Debugging:**
  - Use IDE or command-line Java debugging tools. No custom debug configuration.
- **Testing:**
  - No test files or frameworks present. All demonstration is via the `main` method.

## Conventions & Patterns
- **Naming:**
  - Class name is `HelloWorld` (note: file is `Helloworld.java`, but Java convention is `HelloWorld.java`).
  - Methods and fields use standard Java camelCase.
- **Encapsulation:**
  - Fields are private; access is only within the class.
- **Demonstration:**
  - All features are shown in `main()` with multiple object instantiations and method calls.

## Integration Points
- **No External Dependencies:**
  - Pure Java; no libraries, frameworks, or external services.

## Example Usage
```java
HelloWorld student = new HelloWorld("Lee");
student.greet();
student.greet("Welcome");
student.introduce();

HelloWorld student2 = new HelloWorld("Alex", 25);
student2.greet();
student2.greet("Good morning");
student2.introduce();
```

## Key File
- `Helloworld.java`: Contains all source code and entry point.

## Agent Guidance
- Focus on clear, readable Java code.
- Demonstrate new features in `main()`.
- Maintain single-file simplicity unless requirements change.
- Use standard Java build/run commands.

---

*If any conventions or workflows are unclear or missing, please provide feedback to improve these instructions.*
