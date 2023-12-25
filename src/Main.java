// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxIndex = indexOfMax(numbers);
        System.out.println("En büyük öğe dizin: " + maxIndex);
    }
    public static int indexOfMax(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

