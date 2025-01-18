public class PracticeProblem{
    public static void main(String[] args) {
        System.out.println("Even Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

