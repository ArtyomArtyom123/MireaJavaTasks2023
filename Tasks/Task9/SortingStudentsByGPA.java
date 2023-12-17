import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        if (student1.GPA < student2.GPA) return 1;
        else if (student1.GPA == student2.GPA) return 0;
        else return -1;
    }
}
