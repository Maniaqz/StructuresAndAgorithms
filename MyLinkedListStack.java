public class MyLinkedListStack <T> {

    private final LinkedList<T> linkedList = new LinkedList<>();

    public void push(T data) {
        linkedList.addFirst(data);
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    public T peek () {
        return (T) linkedList.getFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }

}

class LinkedList<T> {

    // внутренний класс, который представляет элемент списка
    private static class Node<T> {

        // данные
        private T data;
        // указатель на следующий элемент
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<T> first = null;

    // используется для push операции
    public void addFirst(T data) {
        Node<T> newFirst = new Node<T>(data);
        newFirst.next = first;
        first = newFirst;
    }

    // используется для pop операции
    public T removeFirst() {
        Node<T> oldFirst = first;
        first = first.next;
        return oldFirst.data;
    }

    @Override
    public String toString() {
        StringBuilder listBuilder = new StringBuilder();
        Node currentNode = first;
        while (currentNode != null) {
            listBuilder.append(currentNode).append(",");
            currentNode = currentNode.next;
        }
        return listBuilder.toString();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public Node<T> getFirst() {
        return first;
    }
}
