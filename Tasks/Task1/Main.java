import java.util.Scanner;
public class Main {
    public static void f1(int[] arr) {
        int sum = 0;
        for (int i = 0; i != arr.length; ++i) {
            sum += arr[i];
        }

        double avg = sum / (double) arr.length;

        System.out.println(sum);
        System.out.println(avg);

    }

    public static int find_max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i != arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int find_min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i != arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void f2(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i != arr.length) {
            System.out.println("Enter the arr[" + i + "] element: ");
            if (sc.hasNextInt())
            {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("Wrong data type!");
                return;
            }
            ++i;
        }
        System.out.println("Max is " + find_max(arr));
        System.out.println("Min is " + find_min(arr));
    }

    public static int factorial(int x)
    {

        if (x <= 1) return 1;
        else return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,79};
        f1(x);
        int[] y = new int[5];
        f2(y);
    }
}