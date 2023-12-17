import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void print_arr(int[] arr){
        System.out.println("Array:");
        for (int i = 0; i != arr.length; ++i){
            System.out.println(arr[i]);
        }
    }
    public static int[] even_arr(int[] arr){
        int size = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i != arr.length; ++i){
            if (arr[i] % 2 == 0) {
                temp[size++] = arr[i];
            }
        }
        int[] new_arr = new int[size];
        for(int i = 0; i != size; ++i){
            new_arr[i] = temp[i];
        }
        return new_arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n;
        while (true) {
            System.out.print("Enter the size of array: ");
            n = sc.nextInt();
            if (n > 0) break;
        }
        int[] arr = new int[n];
        for (int i = 0; i != arr.length; ++i) {
            arr[i] = random.nextInt(n + 1);
        }
        print_arr(arr);
        System.out.println();
        int[] new_arr = even_arr(arr);
        print_arr(new_arr);
    }
}