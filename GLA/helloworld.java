import java.time.LocalTime;

public class helloworld{
    public static void main(String[] args) {
        while (true) {
            // Print "Hello, World!" with the current time
            System.out.println("Hello, World! - " + LocalTime.now());

            // Wait for 60 seconds (60000 milliseconds)
            try {
                Thread.sleep(60000);            } catch (InterruptedException e) {
                System.out.println("Program interrupted!");
                break;
            }
        }
    }
}
