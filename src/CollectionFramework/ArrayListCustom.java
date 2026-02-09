package CollectionFramework;

import java.util.Arrays;

public class ArrayListCustom<E> {

    //Define initial capacity size of elements in custom ArrayList
    private static final int INITIAL_CAPACITY = 10;
    private  int size ; // default value is 0
    private Object elementData[] = {};

    public ArrayListCustom() {
        elementData = new Object[INITIAL_CAPACITY];
    }

    public void add(E e){
        if (size == elementData.length){
            ensureCapacity();
        }
        elementData[size++] = e;
    }

    public E get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index : "+ index + ", size "+index);
        }
        return (E) elementData[index]; //return value on index
    }

    public Object remove(int index){
        //if index is negative or greater than size of  size, we through exception
    if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: "+ index + ", Size"+index);
    }

    Object removeElement = elementData[index];
    for (int i = index; i < size - 1; i++){
        elementData[i] = elementData[i + 1];
    }
    size--;

    return  removeElement;
    }

    private void ensureCapacity(){
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData,newIncreasedCapacity);
    }

    public void display(){
        System.out.println("Displaying list : ");
        for (int i = 0; i< size; i++){
            System.out.print(elementData[i] + " ");
        }
    }
}

