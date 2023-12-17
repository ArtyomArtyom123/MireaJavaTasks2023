public abstract class FormatNumber {
    public static String getNumber(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        if (!string.startsWith("+")){
            int n = (int)stringBuilder.charAt(0);
            --n;
            stringBuilder.replace(0,1, "+" + (char)n);
        }
        stringBuilder.insert(2, '(');
        stringBuilder.insert(6, ')');
        stringBuilder.insert(7,'-');
        stringBuilder.insert(11, '-');
        return stringBuilder.toString();
    }

}
