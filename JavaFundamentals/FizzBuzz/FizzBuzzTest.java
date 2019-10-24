public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fB = new FizzBuzz();
        for (int i = 0; i < 100; i++) {
            String result = FizzBuzz.fizzBuzz(i);
            String output = String.format("Number: %d :: Result: %s", i, result);
            System.out.println(output);
        }
    }
}
