package _09_list.exercise;

import java.util.Arrays;

public class MyArrayList<E> {
    //thuộc tính:
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    //constructor:
    public MyArrayList() {
        System.out.println("the elements array has length is "+DEFAULT_CAPACITY);
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity>0){
            System.out.println("the elements array has length is "+capacity);
            elements = new Object[capacity];
        }else {
            System.out.println("capacity is illegal");
            throw new IllegalArgumentException("capacity "+capacity);
        }
    }

    //phương thức thêm một phần tử tại vị trí bất kỳ:
    public void add(E newElement,int index){
        if (index>elements.length){
            System.out.println("index is illegal");
            throw new IllegalArgumentException("index "+index);
        }else if (elements.length ==index+1){
            ensureCapacity(1);
        }
        if (elements[index]==null){
            size++;
        } else {
            if (size==elements.length){
                ensureCapacity(1);
            }
            System.arraycopy(elements,index,elements,index+1,size-index);
            elements[index] = newElement;
            size++;
        }
    }
    //phương thức xóa phần tử tại vị trí bất kỳ:
    public E remove(int index){
        if (index<0||index>elements.length){
            System.out.println("index is illegal");
            throw new IllegalArgumentException("index "+index);
        }
        E removeElenment = (E) elements[index];
        for (int i = index;i<size-1;i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return removeElenment;
    }
    //phương thức trả về số lượng phần tử
    public int size(){
        return size;
    }

    //phương thức sao chép
    public MyArrayList<E>clone(){
        MyArrayList<E> copy= new MyArrayList<>();
        copy.elements = Arrays.copyOf(elements,size);
        copy.size = size;
        return copy;
    }

    //phương thức kiểm tra 1 bị trí có thuộc mảng không
    public boolean contain (E randomElement){
        for (int i = 0; i < size; i++)
            if (randomElement.equals(elements[i])) {
                return true;
            }
        return false;
    }

    //phương thức kiểm tra vị trí của 1 phần tử:
    public int indexOf(E randomElements){
        int index = -1;
        for (int i = 0;i<size;i++){
            if (this.elements[i].equals(randomElements)){
                index = i;
                break;
            }
        }return index;
    }

    //phương thức thêm 1 giá trị ở đầu mảng:
    public boolean add(E newElement){
        if (size == elements.length){
            ensureCapacity(1);
        }elements[size] = newElement;
        size++;
        return true;
    }

    //phương thức tăng Capacity của mảng:
    public void ensureCapacity(int minCapacity){
        if (minCapacity>0){
            int newSize  = this.elements.length+minCapacity;
            System.out.println("the elements array has length is "+newSize);
            elements = Arrays.copyOf(elements,newSize);
        }else {
            System.out.println("Min capacity is illegal");
            throw new IllegalArgumentException("Min capacity "+minCapacity);
        }
    }

    //phương thức lấy ra 1 phần tử tại vị trí bất kỳ:
    public E get(int i){
        return (E) elements[i];
    }

    //phương thức xóa mảng
    public void clear(){
        size = 0;
        for (int i = 0;i<elements.length;i++){
            elements[i] = null;
        }
    }
}
