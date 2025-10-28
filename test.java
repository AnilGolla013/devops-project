public class test {
    public static void main(String[] args) {
        System.out.println("Test step: running tests...");
        // simple unit-check
        if (build.add(2, 3) != 5) {
            System.err.println("TEST FAILED: add(2,3) != 5");
            System.exit(1);
        }
        System.out.println("All tests passed");
    }
}
