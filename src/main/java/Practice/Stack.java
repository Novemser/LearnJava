package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Project: LearnJava
 * Package: Practice
 * Author:  Novemser
 * 2016/10/13
 */
public class Stack implements Collection<Integer> {

    private ArrayList<Integer> elements;

    private class StackIterator implements Iterator<Integer> {
        private int index = 0;
        private Object[] elements = Stack.this.elements.toArray();

        @Override
        public boolean hasNext() {
            return index < elements.length;
        }

        @Override
        public Integer next() {
            if (!hasNext())
                throw new NoSuchElementException();

            return (Integer) elements[index++];
        }

        public void reset() {
            index = 0;
        }
    }

    class StackIteratorV2 {
        private int index = 0;
        private Object[] elements = Stack.this.elements.toArray();

        public void reset() {
            index = 0;
        }

        public int next() {
            if (!hasNext())
                throw new NoSuchElementException();

            return (int) elements[index++];
        }

        public boolean hasNext() {
            return index < elements.length;
        }
    }

    public Stack(Stack stack) {

    }

    public Stack() {
        elements = new ArrayList<>();
        elements.iterator();
    }

    public void push(int number) {
        elements.add(number);
    }

    public int pop() {
        if (elements.size() == 0)
            throw new ArrayIndexOutOfBoundsException("没有东西了呢");

        int res = elements.get(0);
        elements.remove(0);

        return res;
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }

    @Override
    public Object[] toArray() {
        return elements.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return elements.toArray(a);
    }

    @Override
    public boolean add(Integer integer) {
        return elements.add(integer);
    }

    @Override
    public boolean remove(Object o) {
        return elements.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return elements.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return elements.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return elements.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return elements.retainAll(c);
    }

    @Override
    public void clear() {
        elements.clear();
    }

    public static void main(String...args) {
        Stack myStack = new Stack();

        myStack.push(4);
        myStack.push(40);
        myStack.push(55);
        myStack.push(6);
        myStack.push(87);
        myStack.push(97);

        myStack.pop();
        myStack.pop();
        myStack.pop();

        myStack.push(23333);

        Iterator iterator = myStack.iterator();
        System.out.println("Using system Iterator:");
        while (iterator.hasNext()) {
            System.out.println("Value:" + iterator.next());
        }

        System.out.println(new String(new char[20]).replace('\0', '='));

        StackIteratorV2 stackIter = myStack.new StackIteratorV2();
        System.out.println("Using stackIter:");
        while (stackIter.hasNext()) {
            System.out.println("Value:" + stackIter.next());
        }
        System.out.println(new String(new char[20]).replace('\0', '='));

        stackIter.reset();
        System.out.println("Using reset stackIter:");

        while (stackIter.hasNext()) {
            System.out.println("Value:" + stackIter.next());
        }
        System.out.println(new String(new char[20]).replace('\0', '='));

        System.out.println("Using forEach:");
        for (Integer num : myStack) {
            System.out.println("Value:" + num);
        }
    }
}
