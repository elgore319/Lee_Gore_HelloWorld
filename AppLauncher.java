import java.util.Scanner;

/**
 * Application launcher for HelloWorld demonstration.
 * Shows splash screen, gathers user input, and demonstrates all HelloWorld features.
 */
public class AppLauncher {
    /**
     * Entry point for the HelloWorld demo application.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        printSplashScreen();
        try (Scanner scanner = new Scanner(System.in)) {
            // Gather user input with validation
            HelloWorld user = null;
            while (user == null) {
                try {
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    user = new HelloWorld(name, age);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Error: Age must be a valid integer.");
                }
            }

            // Demonstrate all features
            user.greet();
            user.greet("Welcome");
            user.introduce();
        }

        // Instantiate more HelloWorld objects
        HelloWorld student1 = new HelloWorld("Lee");
        student1.greet();
        student1.greet("Hello again");
        student1.introduce();
    }

    /**
     * Prints an ASCII art splash screen to the console.
     */
    private static void printSplashScreen() {
        System.out.println("=============================");
        System.out.println("   _   _      _ _           ");
        System.out.println("  | | | | ___| | | ___      ");
    System.out.println("  | |_| |/ _ \\ | |/ _ \\   ");
        System.out.println("  |  _  |  __/ | | (_) |    ");
    System.out.println("  |_| |_|\\___|_|_|\\___/     ");
        System.out.println("      HelloWorld Demo        ");
        System.out.println("=============================");
    }
}
