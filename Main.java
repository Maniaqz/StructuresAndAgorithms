import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        String[] stringArr = new String[10];

        stringRandomizer(stringArr);

        // Копируем часть созданного массива во второй, и сортируем его

        long copyTime = System.nanoTime();

        String[] stringArr2 = Arrays.copyOf(stringArr, 5);

        long copyTimeEnd = System.nanoTime() - copyTime;

        long sortTime = System.nanoTime();

        Arrays.sort(stringArr2);

        long sortTimeEnd = System.nanoTime() - sortTime;

        System.out.println("Создана его укороченная копия и отсортированная: " + Arrays.asList(stringArr2));

        System.out.println("Время копирования [" + copyTimeEnd + "]");

        System.out.println("Время сортировки [" + sortTimeEnd + "]");


        System.out.print("2.2 Выполняем линейный поиск: ");

        getValueAt(stringArr2, "Book");

        int[] intArr = {43, 33, 55, 76, 44, 24, 12, 23};

        System.out.println("\n Выполняем двоичный поиск: " + binarySearch(intArr, 33));



        int[] bigArr = new int[400];

        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = random.nextInt(300);
        }

        System.out.println("2.3 Создаём массив: " + Arrays.toString(bigArr));

        long sortTime2 = System.nanoTime();

        Arrays.sort(bigArr);

        long sortTime2End = System.nanoTime() - sortTime2;

        System.out.println("Сортируем его через метод sort()" + Arrays.toString(bigArr));

        System.out.println("Скорость сортировки через метод sort(): " + sortTime2End);

        long sortTime3 = System.nanoTime();

        System.out.println("2.4 Сортируем через пузырьковую сортировку: " + Arrays.toString(bubbleSort(bigArr)));

        long sortTime3End = System.nanoTime() - sortTime3;

        System.out.println("Скорость сортировки через пузырьковую сортировку: " + sortTime3End);

        long sortTime4 = System.nanoTime();

        System.out.println("2.5 Сортируем через сортировку выбором: " + Arrays.toString(chooseSort(bigArr)));

        long sortTime4End = System.nanoTime() - sortTime4;

        System.out.println("Скорость сортировки через сортировку выбором: " + sortTime4End);


        long sortTime5 = System.nanoTime();

        System.out.println("2.6 Сортируем через сортировку вставкой: " + Arrays.toString(insertionSort(bigArr)));

        long sortTime5End = System.nanoTime() - sortTime5;

        System.out.println("Скорость сортировки через сортировку вставкой: " + sortTime5End);
        
    }

    public static void stringRandomizer(String[] stringArr) {

        Random random = new Random();

        String[] buff = {"Sneed", "Feed", "Seed", "Bottle", "Throttle", "Feedback", "Brick", "Dog", "House", "Elephant", "Book", "Sword"};

        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = buff[random.nextInt(12)];
        }

        System.out.println("2.1 Создан оригинальный массив: " + Arrays.toString(stringArr));
    }

    public static void getValueAt(String[] arrForSearch, String searchElement) {

        String searchResult = null;

        for (int i = 0; i < arrForSearch.length; i++) {


            if (arrForSearch[i].equals(searchElement)) {
                searchResult = arrForSearch[i];
            }
        }

        System.out.print(searchElement);

    }

    public static int binarySearch(int[] arrayForSort, int key) {

        int low = 0;

        int high = arrayForSort.length - 1;

        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arrayForSort[mid] < key) {
                low = mid + 1;
            } else if (arrayForSort[mid] > key) {
                high = mid - 1;
            } else if (arrayForSort[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;

    }

    public static int[] bubbleSort(int[] arrayForSort) {

        int buff;

        boolean needSort = true;

        while (needSort) {
            needSort = false;
            for (int i = 1; i < arrayForSort.length; i++) {
                if (arrayForSort[i] < arrayForSort[i - 1]) {
                    buff = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[i - 1];
                    arrayForSort[i - 1] = buff;
                    needSort = true;
                }
            }
        }

        return arrayForSort;


    }

    public static int[] chooseSort(int[] arrayForSort) {
        for (int left = 0; left < arrayForSort.length; left++) {
            int minInd = left;
            for (int i = left; i < arrayForSort.length; i++) {
                if (arrayForSort[i] < arrayForSort[minInd]) {
                    minInd = i;
                }
            }
            swap(arrayForSort, left, minInd);
        }
        return arrayForSort;
    }

    public static int [] insertionSort (int [] arrayForSort) {
        for (int left = 0; left < arrayForSort.length; left++) {

            int value = arrayForSort[left];

            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arrayForSort[i]) {
                    arrayForSort[i + 1] = arrayForSort[i];
                } else {
                    break;
                }
            }

            arrayForSort[i + 1] = value;
        }

        return arrayForSort;
    }

    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

}
