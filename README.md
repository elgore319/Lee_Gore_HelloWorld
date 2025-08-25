Level 1 - AI Reflection (150–250 words)

What AI tools did you use?
- I used the github copilot extension in vscode

What was correct or incorrect?
- Nothing was incorrect

What changes did you make and why?
I copied the code and pasted it into the file, but it did not have any spacing.  I spaced the different lines of code to make it more comprehensable when reading


Level 2 - AI Reflection

Include your AI prompt and AI output

(Prompt)

Add private int age field

Create a second constructor: (String name, int age)

Add introduce() method → Hello, my name is [name] and I am [age] years old.

Overload greet() to allow a custom message

Demonstrate all features in main()

(Output)

public class HelloWorld { 
    private String name;
    private int age;

    public HelloWorld(String name) { 
        this.name = name;
        this.age = 0; // Default age
    } 

    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() { 
        System.out.println("Hello, " + name + "!");
    } 

    // Overloaded greet method
    public void greet(String customMessage) {
        System.out.println(customMessage + ", " + name + "!");
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) { 
        HelloWorld student = new HelloWorld("Lee");
        student.greet();
        student.greet("Welcome");
        student.introduce();

        HelloWorld student2 = new HelloWorld("Alex", 25);
        student2.greet();
        student2.greet("Good morning");
        student2.introduce();
    } 
}

Explain what you kept or changed and why
I got rid of one of the constructor methods because only one is neccessary for the actions that this code is trying to accomplish.
I also got rid of the student2 object as it is unnecessary for getting the desired output. Since I did this I moved the line "student2.greet("Good morning");" to the student object.


Level 3 - AI Reflection

What did the AI get wrong in debugging?
The scanner object is never closed

How did you fix or improve it?
try (Scanner scanner = new Scanner(System.in))

(It also continues to make unnecessary objects for demonstrating the code, but I just deleted these)

Would you use this code in a real-world app?
Probably not, but if I did I would probably heavily condense and simplify it to make it more comprehensible.
