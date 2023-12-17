import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.next();
        System.out.print("Enter the email: ");
        String email = sc.next();
        System.out.print("Enter the gender: ");
        char gender = sc.next().charAt(0);
        sc.close();
        Author author = new Author(name, email, gender);
        System.out.println(author);
    }
}

class Author
{
    private final String name;
    private String email;
    private final char gender;
    Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {return name;}
    public String getEmail() {return email;}
    public char getGender() {return gender;}
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString()
    {
        return name + ", " + email + ", " + gender;
    }
}