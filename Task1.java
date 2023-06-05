/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class Task1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // devideByZero(a, b);

        int[] arr = new int[] { 1, 3, 4, 5 };
        int num = 10;
        // indexOutOfBounds(arr, num);

        String c = "12cf";
        numberFormat(c);

    }

    public static int devideByZero(int a, int b) {
        return a / b;
    }

    public static int indexOutOfBounds(int[] arr, int num) {
        return arr[10];
    }

    public static int numberFormat(String c) {
        return Integer.parseInt(c);
    }

}