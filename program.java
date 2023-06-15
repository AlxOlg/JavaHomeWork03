package JavaHomeWork03;
import java.util.ArrayList;
import java.util.Random;

/**
 * program
 */
public class program {

// Генератор списка случайных целых чисел.
    private static ArrayList<Integer> createArrayList(int size, int minVal, int maxVal) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(minVal, maxVal + 1));
        }
        return list;
    }

// Поиск минимального значения в списке.
    private static Integer findMin(ArrayList<Integer> list) {
        Integer minVal = list.get(0);
        for (Integer item : list) {
            if (item < minVal) {
                minVal = item;
            }
        }
        return minVal;
    }

// Поиск максимального значения в списке.
    private static Integer findMax(ArrayList<Integer> list) {
        Integer maxVal = list.get(0);
        for (Integer item : list) {
            if (item > maxVal) {
                maxVal = item;
            }
        }
        return maxVal;
    }

// Поиск среднего значения в списке.
    private static Double findAverage(ArrayList<Integer> list) {
        Integer sum = 0;
        for (Integer item : list) {
            sum += item;
            }
        Double average = (double) sum / list.size();
        return average;
    }

// Удаление четных чисел из списка.
    private static void removeEven(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int size = 21, minVal = 0, maxVal = 10;
        ArrayList<Integer> list = new ArrayList<>();
        list = createArrayList(size, minVal, maxVal);
        System.out.println(list);
        System.out.printf("Минимальное значение: %d\n", findMin(list));
        System.out.printf("Максимальное значение: %d\n", findMax(list));
        System.out.printf("Среднее значение: %f\n", findAverage(list));
        removeEven(list);
        System.out.println("Четные удалены: " + list);
    }
}
