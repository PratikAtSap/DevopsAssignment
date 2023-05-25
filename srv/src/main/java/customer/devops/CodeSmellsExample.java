import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodeSmellsExample {

    private final int x;
    private final int y;
    private static final Logger logger = LoggerFactory.getLogger(CodeSmellsExample.class);

    public CodeSmellsExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int calculateSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public void doSomething() {
        try {
            // Perform some risky operation
            int result = x / y;
        } catch (ArithmeticException e) {
            logger.error("An error occurred: {}", e.getMessage());
        }
    }

    public void printMessage(String message) {
        logger.info("Message: {}", message);
    }

    public void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            logger.info("Message: {}", message);
        }
    }

    public static void main(String[] args) {
        CodeSmellsExample example = new CodeSmellsExample(5, 10);
        logger.info("X: {}", example.getX());
        logger.info("Y: {}", example.getY());
        logger.info("Sum: {}", example.calculateSum());
        example.doSomething();
        example.printMessage("Hello, World!");
        example.printMessage("Goodbye!", 3);
    }
}
