import java.util.Random;
import java.util.ArrayList;
public class TesterSort {
    public static void print(Student[] arr){
        for (int i = 0; i != arr.length; ++i){
            System.out.println(arr[i].idNumber);
        }
    }
    public static void print(ArrayList<Student> list){
        for (Student student: list){
            System.out.printf("ID: %10d\tGPA: %10.3f\n",
                    student.idNumber, student.GPA);
        }
    }
    public static void InsertionSort(Student[] students){
        int j;
        for (int i = 1; i < students.length; ++i){
            Student temp = students[i];
            for(j = i; j >0 && temp.compareTo(students[j - 1]) < 0; --j ){
                students[j] = students[j-1];
            }
            students[j] = temp;
        }
    }

    public static void main(String[] args){
        Random random = new Random();
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        /*Student[] students = new Student[25];
        for (int i = 0; i != students.length; ++i){
            students[i] = new Student(random.nextInt(1,10000));
        }
        print(students);
        InsertionSort(students);
        System.out.println("\n\n");
        print(students);
        */
        ArrayList<Student> list = new ArrayList<>(100);
        for (int i = 0; i != 100; ++i){
            list.add(new Student(random.nextInt(1,10000), random.nextFloat(2, 5)));
        }
        print(list);
        System.out.println("\n\n\n\n");
        list.sort(sortingStudentsByGPA);
        print(list);
    }
}
