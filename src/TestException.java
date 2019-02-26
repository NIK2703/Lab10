import java.io.PrintStream;

public class TestException {


    TestException() {

    }

    void one() {
        System.out.println("Метод one()");
        try {
            int a = 0;
            int b = 1 / a;
        }
        catch (ArithmeticException e) {
            System.out.println("Вызвано исключение деление на ноль.");
        }
    }

     void two() {
         System.out.println("Метод two()");
        try {
            int a[] = {1,2,3};
            int b = a[3];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вызвано исключение: " + e);
        }
    }

     void three(int exceptionType) {
         System.out.println("Метод three() с параметром " + exceptionType);
        try {
            switch (exceptionType) {
                case 0:
                    throw new NullPointerException();
                case 1:
                    throw new ArithmeticException();
                case 2:
                    throw new ArrayIndexOutOfBoundsException();
            }
        }
        catch (NullPointerException e) {
            System.out.println("Вызвано исключение: " + e);
        }
        catch (ArithmeticException e) {
            System.out.println("Вызвано исключение: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вызвано исключение: " + e);
        }

    }

     void four() {
         System.out.println("Метод four()");
        try {
            throw new MyException();
        }catch (MyException e) {
            System.out.println("Вызвано исключение: " + e);
        }
    }

}