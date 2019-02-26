import java.util.Date;

public class MyException extends Exception {
    Date throwDate;

    MyException() {
        throwDate = new Date();
    }

    public Date getDate(String msg) {
        return throwDate;
    }

    public String getDangerLevel() {
        return "Исключение безопасно";
    }

    public String toString(){
        return throwDate + " - вызвано исключение MyException, уровень опасности: " + getDangerLevel();
    }

}
