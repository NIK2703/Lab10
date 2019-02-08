public class Main {

    static void one(){
        System.out.println("Метод one()");
        try {
            int a = 0;
            int b = 1 / a;
        }
        catch (ArithmeticException e){
            System.out.println("Сгенерировано исключение деление на ноль.");
        }
    }

    static void two(){
        System.out.println("Метод two()");
        try {
            int a[] = {1,2,3};
            int b = a[3];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Сгенерировано исключение: " + e);
        }
    }

    static void three(int exceptionType){
        System.out.println("Метод three() с аргументом " + exceptionType);
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
        catch (NullPointerException e){
            System.out.println("Сгенерировано исключение: " + e);
        }
        catch (ArithmeticException e){
            System.out.println("Сгенерировано исключение: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Сгенерировано исключение: " + e);
        }

    }

    static void four(){
        System.out.println("Метод four()");
        try {
            throw new MyException();
        }catch (MyException e){
            System.out.println("Сгенерировано исключение: " + e);
        }
    }

    public static void main(String[] args){
        one();
        two();
        three(0);
        three(1);
        three(2);
        four();
    }
}
