package _09_list.practice;

import java.util.Arrays;

public class MyList<E> {
    private int size;               //size xác định số phần tử trong danh sách, mặc định gán là 0.
    private final int DEFAULT_CAPACITY = 10;   // lưu số phần tử đối đa trong danh sách mặc định là 10.
    private Object elements[];        //Mảng elements thuộc kiểu dữ liệu object

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];  //contructor không tham số
    }
    //phương thức  ensureCapa()  gấp đôi capality
        private void ensureCapa(){
        int newSize = DEFAULT_CAPACITY*2;
        elements = Arrays.copyOf(elements,newSize);   //tạo MyList với x2 phần tử đã cho
        }

    // phương thức add;
    public void add(E e) {
        if (size == elements.length) {  //nếu size = độ dài mảng thì khi thêm phần tử vào sẽ bị tràn mảng => gấp đôi cap sau đó copy sang mảng mới
            ensureCapa();
        }
        elements[size++] = e;           //size của mảng elements tăng lên 1
    }
    // phương thức get()
    public E get(int i){         //lấy giá trị phần tử tại vị trí i
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    }

