
/**
 * The HelloWorld class contains the main method that prints a greeting message to the console.
 * <p>
 * Usage: java HelloWorld [name]
 * </p>
 * The program prints "Hello " followed by the first command-line argument.
 * <p>
 * Example:
 * <pre>
 *     java HelloWorld Alice
 *     // Output: Hello Alice
 * </pre>
 * </p>
 *
 * @author smann
 */
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello There " + args[0]);
    }
}