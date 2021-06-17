package _09_list.practice;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("-----Test Linked list-----");
        MyLinkedList list = new MyLinkedList(10);
        list.addFirst(11);
        list.addFirst(9);
        list.addFirst(4);
        list.add(3,5);
        list.printList();
        System.out.println(list.getHead());
    }
}
