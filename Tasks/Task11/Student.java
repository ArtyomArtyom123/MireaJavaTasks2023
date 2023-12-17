import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Student implements Comparable<Student> {
    private final Integer idNumber;
    private final float GPA;
    private final String birthday;
    private char format;
    Student(int id, float GPA, String birthday, char format){
        this.idNumber = id;
        this.GPA = GPA;
        this.birthday = birthday;
        this.format = format;
    }
    public Integer getIdNumber(){
        return idNumber;
    }
    public float getGPA(){
        return GPA;
    }
    public String getBirthday(){
        return birthday;
    }
    public char getFormat(){
        return format;
    }
    public void setFormat(char format){
        if (format == 'c' || format == 'f'){
            this.format = format;
        }
        else{
            System.out.println("Incorrect format input!");
        }
    }
    @Override
    public int compareTo(Student student)
    {
        return idNumber.compareTo(student.idNumber);
    }
    @Override
    public String toString(){
        Date date = null;
        SimpleDateFormat dt1 = null;
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        switch (format) {
            case 'f':
                try {
                    date = dt.parse(birthday);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                dt1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                break;
            case 's':
                try {
                    date = dt.parse(birthday);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                dt1 = new SimpleDateFormat("dd.MM.yyyy");
                break;
        }
        return String.format("Student {\nid = %d,\n GPA = %.3f\n date of birth is %s\n}",
                idNumber, GPA, dt1.format(date));

    }

}
