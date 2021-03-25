import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 3.1

        Integer [] arr = {5, 8, 34, 5, 55, 94};

        long start = System.nanoTime();

        ArrayList <Integer> arrList = new ArrayList <> (Arrays.asList(arr));


        long end = System.nanoTime() - start;

        System.out.println("Создана коллекция: " + arrList.toString());

        System.out.println("Время преобразования массива в коллекцию: [" + end + "]");

        // 3.2

        arrList.add(444);

        arrList.remove(0);

        arrList.ensureCapacity(20);

        System.out.println(arrList.get(4));

        ArrayList arrList2 = new ArrayList();

        arrList2.addAll(arrList);

        // 3.3

    }





}
