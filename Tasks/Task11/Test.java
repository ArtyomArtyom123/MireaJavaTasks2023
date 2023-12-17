import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String date = "2023-09-01 01:23:45";
        System.out.println("Enter the format of date - f for full or s for short");
        char f = sc.next().charAt(0);
        Student student = new Student(12345, 4.99f, date, f);
        System.out.println(student.toString());
    }
}
