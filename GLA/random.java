import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(900) + 100;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
