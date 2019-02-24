public class Main {
    public static void main(String[] args) {
        TestException te = new TestException();


        te.one();
        te.two();
        te.three(0);
        te.three(1);
        te.three(2);
        te.four();
    }
}
