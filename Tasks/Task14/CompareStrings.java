import java.util.regex.Pattern;

public abstract class CompareStrings {
    public static boolean matches(String first, String second){
        return Pattern.matches(first, second);
    }
}
