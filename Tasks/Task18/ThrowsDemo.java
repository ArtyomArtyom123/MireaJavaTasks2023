import java.util.Scanner;
public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in
        );
        String key = myScanner.nextLine();
        try {
            printDetails(key);
        }
        catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
            System.out.println("Try again:");
            getKey();
        }
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch (Exception ex){
            //do something...
            throw ex;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.isEmpty()) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}
