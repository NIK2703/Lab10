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
        return "���������� ���������";
    }

    public String toString(){
        return "������� ���������� MyException, ������� ���������: " + getDangerLevel();
    }

}
