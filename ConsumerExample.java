import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printString = (s) -> System.out.println(s); // creating a consumer that prints a string
        printString.accept("From ConsumerExample"); // using the consumer to print a string
    }
}
