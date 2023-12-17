import java.util.regex.Pattern;
public abstract class SplitString {
    public static String[] splitStr(String string, String delimiter){
        Pattern d = Pattern.compile(delimiter);
        return d.split(string);
    }
}
