import java.text.NumberFormat;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 100/i );
        }
        catch(NumberFormatException ex){
            System.out.println("Incorrect number format!");
        } catch(ArithmeticException ex){
            System.out.println("Attempted division by zero");
        }
        finally{
            System.out.println("...finally...");
        }
    }
}
