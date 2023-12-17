public class Student implements Comparable<Student> {
    public Integer idNumber;
    public final float GPA;
    Student(int id, float GPA){
        idNumber = id;
        this.GPA = GPA;
    }
    Student(int id){
        idNumber = id;
        GPA = 0;
    }
    @Override
    public int compareTo(Student student){
        return idNumber.compareTo(student.idNumber);
    }
}
