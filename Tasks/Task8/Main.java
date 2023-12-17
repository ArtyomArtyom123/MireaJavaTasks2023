public class Main {
    static public void f1(int N){
        for (int i = 1, num = 1; i <= N; ++i){
            System.out.println(num);
            if (i == (1+num)*num/2){
                ++num;
            }
        }
    }
    static public int f5(int N){
        if (N == 0) return 0;
        return N%10 + f5(N/10);
    }

    static public void f8(String string){
        if (string.length() <=1) {
            System.out.println("YES");
        } else if (string.charAt(0) == string.charAt(string.length() - 1)) {
            f8(string.substring(1, string.length() - 1));
        }
        else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {

    }
}