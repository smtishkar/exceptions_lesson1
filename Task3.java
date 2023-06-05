import java.util.ArrayList;

/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов 
 * не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
 * которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

public class Task3 {
    public static void main(String[] args) {

        // ArrayList<Integer> newArr = new ArrayList<>();

        int[] arr1 = new int[] { 10, 6, 3, 5, 7 };
        // int[] arr2 = new int[] { 1, 3, 2, 1, 9 }; // Правильный массив
        // int[] arr2 = new int[] {}; // Пустой массив
        // int[] arr2 = new int[] {1}; // Не одинаковый по длинне массив
        int[] arr2 = new int[] { 1, 3, 2, 0, 9 }; // Массив в 0 в знаменателе

        try {
            ArrayList<Float> arr3 = newarr(arr1, arr2);
            System.out.println(arr3);

        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public static ArrayList<Float> newarr(int[] arr1, int[] arr2) {
        ArrayList<Float> newArr = new ArrayList<>();
        float num;
        if (arr1.length < 1 || arr2.length < 1)
            throw new RuntimeException("Один из массивов пустой");
        if (arr1.length != arr2.length)
            throw new RuntimeException("Длина массивов не равна");
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] != 0) {
                num = arr1[i] / arr2[i];
                newArr.add(num);
            } else {
                throw new RuntimeException("Знаменатель равен 0, а именно элемент с индексом " + i);
            }
        }
        return newArr;
    }

}
