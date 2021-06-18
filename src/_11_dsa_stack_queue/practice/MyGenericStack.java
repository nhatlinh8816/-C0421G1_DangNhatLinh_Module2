package _11_dsa_stack_queue.practice;

import java.util.EmptyStackException;
import java.util.LinkedList;

//tạo lớp GenericStack
public class MyGenericStack<T> {
   private LinkedList<T> stack;         //khởi tạo thuộc tính LinkedList cho lớp MyGenericStack;
    public MyGenericStack() {
        stack = new LinkedList();       //khởi tạo contructor không tham số;
    }
    //phương thức push;
    public void push(T element){
        stack.addFirst(element);
    }
    //phương thức pop;
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    //phương thức kiểm tra satck có rỗng hay không
    public boolean isEmpty() {
        if (stack.size()==0){
            return true;
        }
        return false;
    }
    //phương thức kiểm tra size của stack;
    public int size(){
        return stack.size();
    }
}

