public class MyStack {
    private int stCapacity; // максимальный размер
    private int [] stArr; // массив в основе
    private int stTop; // верхнй элемент

    public MyStack(int capacity) {
        this.stCapacity = capacity;
        this.stArr = new int [stCapacity];
        this.stTop = -1;
    }

    // Добавляем элемент на вершину

    public void addElement (int element) {
        stArr[++stTop] = element;
    }

    /* Производим удаление, реализуя смещение указания top на предпоследний элемент. Предыдущий top
    будет удалён при помощи Java Garbage Collector */

    public int deleteElement () {
        return stArr [stTop--];
    }

    // Читаем элемент с вершины

    public int readElement () {
        return  stArr [stTop];
    }

    // Булевая проверка на пустоту стека

    public boolean isEmpty () {
        return (stTop == -1);
    }

    // Булевая проверка на то, полони ли стек

    public boolean isFull () {
        return (stTop == stCapacity -1);
    }

}
