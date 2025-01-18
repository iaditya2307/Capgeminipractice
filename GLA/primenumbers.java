public class primenumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            boolean isPrime = i > 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }
    }
}
