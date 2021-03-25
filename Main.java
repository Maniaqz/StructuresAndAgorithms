import java.util.Arrays;
import java.util.Random;

public class Main {

    /* Задание 1.1 (Приведите пример алгоритмов и структур данных из жизни.): в качестве примеров алгоритма
    можно привести процедуры приготовления еды, сборки компьютера, и замены масла в автомобиле. К примерам
     структур данных можно отнести автомобильные пробки (в качестве линейной структуры данных, которая
     хранит элементы последовательно), или жилые дома (как хеш-таблицы, где подъезды представляют собой ключ,
     а находящиеся внутри квартиры - значения) */

    /* Задание 1.2 (Приведите пример алгоритмов и структур данных в программировании.): одни из примеров
    алгоритмов в программировании - процедуры сортировки и перебора коллекций.
    Структуры данных:
                        Массив (Array)
                        Стек (Stack)
                        Очередь (Queue)
                        Связный список (Linked List)
                        Дерево (Tree)
                        Граф (Graph)
                        Префиксное дерево (Trie)
                        Хэш-Таблица (Hash Table) */


    public static void main(String[] args) {

    /*  Задание 1.3 Напишите программный код, в котором все данные хранятся только в переменных трех типов данных:
    Ссылочные, примитивные и своего класса содержащего: конструктор и метод отображения данных. Выведите написанные
    данные. */

        int simpleExample = 45;

        String linkedExample = "Sup";

        OwnClass ownExample = new OwnClass("Hello");

        System.out.println(simpleExample + "\n" + linkedExample);

        ownExample.writeToConsole();


    /*  Задание 1.4: Дополните предыдущий код сравнением ваших данных с другой переменной, данный код должен
    имитировать простейший поиск перебором. Оцените время выполнения алгоритма с помощью базового метода
    System.nanoTime(). */


        // Создаём массив int

        int [] arrayExample = new int[500];

        Random random = new Random();

        // Заполняем массив int произвольными значениями

        for (int i = 0; i < arrayExample.length; i++) {
            arrayExample [i] = random.nextInt(9000);
        }

        // Создаём массив собственного класса

        OwnClass [] ownArray = new OwnClass[500];

        // Перебираем массив собственного класса

        for (int i = 0; i < ownArray.length ; i++) {
            ownArray [i] = new OwnClass("Hello");
        }

        // Сравниваем перебор двух получившихся массивов

        long nanoTimeInt = System.nanoTime();

        for (int i = 0; i < arrayExample.length; i++) {

        }

        long nanoTimeIntEnd = System.nanoTime() - nanoTimeInt;

        System.out.printf("Скорость прохода по массиву int составляет: %d \n", nanoTimeIntEnd);

        long nanoTimeOwn = System.nanoTime();

        for (int i = 0; i < ownArray.length; i++) {

        }

        long nanoTimeOwnEnd = System.nanoTime() - nanoTimeInt;

        System.out.printf("Скорость прохода по массиву собственного класса составляет: %d", nanoTimeOwnEnd);

        int [] bigArr = new int[500];

        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = random.nextInt(300);
        }

        System.out.println(Arrays.asList(bigArr));

    }
}

class OwnClass {

    private String classString;

    public OwnClass(String classString) {
        this.classString = classString;
    }

    public void writeToConsole() {
        System.out.println(this.classString);
    }

}
