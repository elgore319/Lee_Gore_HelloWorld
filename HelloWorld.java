/**
 * Represents a person with a name and age, and provides greeting and introduction methods.
 */
public class HelloWorld { 
    private String name;
    private int age;


    /**
     * Constructs a HelloWorld object with the given name and default age 0.
     * @param name The name of the person.
     * @throws IllegalArgumentException if name is empty.
     */
    public HelloWorld(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
        this.age = 0;
    }

    /**
     * Constructs a HelloWorld object with the given name and age.
     * @param name The name of the person.
     * @param age The age of the person.
     * @throws IllegalArgumentException if name is empty or age is negative.
     */
    public HelloWorld(String name, int age) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.name = name;
        this.age = age;
    }



    /**
     * Prints a standard greeting to the console.
     */
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }


    /**
     * Prints a custom greeting message to the console.
     * @param customMessage The custom message to use.
     */
    public void greet(String customMessage) {
        System.out.println(customMessage + ", " + name + "!");
    }


    /**
     * Prints an introduction message to the console.
     */
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // ...main method removed. Use AppLauncher.java for launching the application.
}