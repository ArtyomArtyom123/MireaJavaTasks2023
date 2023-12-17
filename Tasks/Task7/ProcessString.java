public class ProcessString implements StringChanger {
    @Override
    public int size(String string){
        int sz = 0;
        for (char c: string.toCharArray()){
            ++sz;
        }
        return sz;
    }
    @Override
    public String oddString(String string){
        int sz = size(string) / 2;
        char[] chars = new char[sz];
        for(int i = 0, j = 1; i != chars.length; ++i){
            chars[i] = string.charAt(j);
            j += 2;
        }
        return String.valueOf(chars);
    }
    @Override
    public String reverse(String string){
        int sz = size(string);
        char[] chars = new char[sz];
        for (int i = 0; i != chars.length; ++i){
            chars[i] = string.charAt(sz - i - 1);
        }
        return String.valueOf(chars);
    }
}
