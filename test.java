public class test {
    public static void main(String[] args) {
        System.out.println("Test step: running tests...");
        System.out.println("Here is the test.java file ");
        if (build.add(2, 3) != 5) {
            System.err.println("TEST FAILED: add(2,3) != 5");
            System.exit(1);
        }
        System.out.println("All tests passed!! Successfully......");
    }
}
