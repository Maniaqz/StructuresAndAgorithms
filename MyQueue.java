public class MyQueue {
    private int [] queue; // массив в основе очереди
    private int maxCapacity; // максимальное количество элементов в очереди
    private int size; // текущее количество элементов в очереди
    private int front; // указание на фронтальный элемент
    private int rear; // указание на задний элемент

    public MyQueue(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.queue = new int[maxCapacity];
        this.rear = -1;
        this.front = 0;
        this.size = 0;
    }

    // Вставляем элемент в очередь

    public void insert (int element) {
        if (rear == maxCapacity - 1) {
            rear = -1;
        } // циклический перенос
        queue [++rear] = element; // помещаем элемент
        size++; // увеличиваем размер очереди
    }

    // Удалить элемент из очереди

    public int remove () {
        int temp = queue[front++]; // получаем элемент из начала

        if (front == maxCapacity) {
            front = 0;
        } // циклический перенос
        size--; // уменьшаем размер очереди
        return temp;
    }

    // Получить значение с начала очереди

    public int getFront() {
        return queue[front];
    }

    // Получить значение с конца очереди

    public int getRear() {
        return queue[rear];
    }

    // Булевая проверка на заполненность очереди

    public boolean isFull() {
        return (size == maxCapacity - 1);
    }

    // Булевая проврека на пустоту очереди

    public boolean isEmpty() {
        return (size == 0);
    }

    // Получить значение размера очереди (не объёма)

    public int getSize() {
        return size;
    }

}
