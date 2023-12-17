import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("(\\d+)(\\.\\d+)*(\\s)(RUB|USD|EUR)");
        Matcher m1 = p1.matcher( "13.10 RUB, 23.12 EUR, 55.56 USD, 5 USD" );
        while (m1.find()){
            System.out.println(m1.group());
        }

    }
}