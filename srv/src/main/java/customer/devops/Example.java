public class CodeSmellsExample {

    private int x;
    private int y;

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
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Message: " + message);
        }
    }

    public static void main(String[] args) {
        CodeSmellsExample example = new CodeSmellsExample(5, 10);
        System.out.println("X: " + example.getX());
        System.out.println("Y: " + example.getY());
        System.out.println("Sum: " + example.calculateSum());
        example.doSomething();
        example.printMessage("Hello, World!");
        example.printMessage("Goodbye!", 3);
    }
}
