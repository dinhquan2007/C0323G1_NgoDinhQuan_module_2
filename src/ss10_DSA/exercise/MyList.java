package ss10_DSA.exercise;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }


    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index :" + index);
        } else if (elements.length == size) {
            ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }


    public E remote(int index) {
        if (index<0||index>elements.length){
            throw new IllegalArgumentException("không có vị trí :"+index);
        }
        E element=(E) elements[index];
        for (int i = 0; i < size-1; i++) {
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }

    public int side() {
        return this.size;

    }

    public MyList<E> clone() {
        MyList<E> b = new MyList<>();
        b.elements = Arrays.copyOf(elements, size);
        b.size = this.size;
        return b;
    }

    public boolean contains(E o) {
        return this.indexOf(o) > 0;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return index;
    }

    public boolean add(E o) {
        if (elements.length == size) {
            ensureCapacity(5);
        }
        elements[size] = o;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }

    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
