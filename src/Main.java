import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {4, 10, 22, 9, 100};
        int searchNum = 22;

        System.out.println("Задан массив: " + Arrays.toString(array));
        System.out.println("Необходимо найти индекс числа " + searchNum);

        int index = binarySearch.search(array, searchNum, 0, array.length - 1);
        if (index == -1) System.out.println("В массиве нет такого числа!");
        else System.out.println("Индекс искомого элемента = " + index);
    }
}
