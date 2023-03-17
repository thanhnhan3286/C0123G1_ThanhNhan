package ss10_dsa_danh_sach.bai_tap.java_util_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    public E get (int i){
        if(i>= size || i<0){
            throw new IndexOutOfBoundsException("Index: "+ i + ", Size "+i);
        }
        return (E) elements[i];
    }
}
