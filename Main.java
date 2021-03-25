import java.util.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();

    // 4.1 реализуйте простой стек и его базовые методы

        MyStack ms = new MyStack(5);

        ms.addElement(5);
        ms.addElement(7);
        ms.addElement(2);
        ms.addElement(3);
        ms.addElement(9);

        for (int i = 0; i < 3; i++) {
            System.out.println("Элемент [" + ms.readElement() + "] прочитан, и удалён");
            ms.deleteElement();
        }

        System.out.println("Верхний элемент стека [" + ms.readElement() + "]");

        // Удаляем всё содерджимое стека

        while (!ms.isEmpty()) {
            ms.deleteElement();
        }

        while (!ms.isFull()) {
            ms.addElement(rnd.nextInt(50));
        }

        System.out.print("Стек содержит следующие элементы: ");

        while (!ms.isEmpty()) {
            System.out.printf(" [%d" + "]", ms.readElement());
            ms.deleteElement();
        }

        // 4.2 реализуйте простую очередь и его базовые методы

        MyQueue mq = new MyQueue(5);

        while (!mq.isFull()) {
            mq.insert(rnd.nextInt(50));
        }

        System.out.println("\nЭлемент в начале очереди: ["+ mq.getFront() + "]");
        System.out.println("\nЭлемент в конце очереди: ["+ mq.getRear() + "]");

        while (!mq.isEmpty()) {
            System.out.println("Элемент [" + mq.getFront() + "] выведен в консоль, и удалён");
            mq.remove();
        }

        // 4.3 реализуйте простую deque и его базовые методы

        Deque deque = new ArrayDeque();

        deque.addFirst(56);

        for (int i = 0; i < 10; i++) {
            deque.add(rnd.nextInt(50));
        }

        System.out.println("Последни элемент deque: [" + deque.peekLast() + "]");

        deque.pollLast();

        // 4.4 реализуйте приоритетную очередь на основе ссылочных типов данных

        PriorityQueue <Integer> priorQ = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            priorQ.add(rnd.nextInt(50));
        }

        Object[] arr;

        System.out.print("Приоритетная очередь содержит следующие элементы: " );
        while (!priorQ.isEmpty()) {
            System.out.printf("[%d]", priorQ.peek());
            priorQ.poll();
        }

        // 4.5 реализуйте стек и очередь на базе связанного списка

        MyLinkedListStack myLinkedStack = new MyLinkedListStack();

        myLinkedStack.push("1");
        myLinkedStack.push("7");
        myLinkedStack.push("3");

        System.out.println("\nПоследний элмент стека на основе связанной очереди: [" + myLinkedStack.peek() + "]");

        Queue linkedQue = new LinkedList();

        linkedQue.add(34);
        linkedQue.add(new Integer(66));
        linkedQue.isEmpty();
    }

}
