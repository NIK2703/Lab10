import java.io.PrintStream;

public class TestException {

    PrintStream printStream;

    TestException() {
        try {
            printStream = new PrintStream(System.out, true, "cp866");
        } catch(Exception e){
            System.out.println("Ошибка изменеия кодировки");
        }
    }

    void one() {
        printStream.println("Метод one()");
        try {
            int a = 0;
            int b = 1 / a;
        }
        catch (ArithmeticException e) {
            printStream.println("Сгенерировано исключение деление на ноль.");
        }
    }

     void two() {
        printStream.println("Метод two()");
        try {
            int a[] = {1,2,3};
            int b = a[3];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            printStream.println("Сгенерировано исключение: " + e);
        }
    }

     void three(int exceptionType) {
        printStream.println("Метод three() с аргументом " + exceptionType);
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
            printStream.println("Сгенерировано исключение: " + e);
        }
        catch (ArithmeticException e) {
            printStream.println("Сгенерировано исключение: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            printStream.println("Сгенерировано исключение: " + e);
        }

    }

     void four() {
        printStream.println("Метод four()");
        try {
            throw new MyException();
        }catch (MyException e) {
            printStream.println("Сгенерировано исключение: " + e);
        }
    }

}