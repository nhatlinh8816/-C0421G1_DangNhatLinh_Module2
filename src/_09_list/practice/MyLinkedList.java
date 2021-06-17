package _09_list.practice;

public class MyLinkedList<E> {          //khai báo myLikedList
    private Node head;              //thuộc tính Node head
    private int numNode = 0;        //thuộc tính trả về số phần tử của LikedList;
// constructor
    public MyLinkedList(Node head, int numNode) {
        this.head = head;
        this.numNode = numNode;
    }

    public MyLinkedList(int numNode) {
        this.numNode = numNode;
    }
    //thêm phần tử tại vị trí đầu tiên
    public void addFirst(E e){
        Node temp = head;           //khai báo biến temp tham chiếu đến vị trí của head;
        head = new Node(e);         //head nhận giá trị là node mới;
        head.next = temp;           //head trỏ đến biến temp ban đầu (giờ là node cũ);
        numNode++;          // tăng số lượng Node lên 1;
    }
    // thêm phần tử tại vị trí index bất kỳ;
    public void add(int index, E data){
        Node temp = head;           //khai báo biến temp tham chiếu đến vị trí của head;
        Node holder;                //khai báo biến Node holder;
        for(int i=0; i < index-1 && temp.next != null; i++) {   //cho con trỏ chạy đến vị trí index -1
            temp = temp.next;
        }
        holder = temp.next; // cho holder tham chiếu đến vị trí index;
        temp.next = new Node(data);   //node tại vị trí index - 1 trỏ tới node mới;
        temp.next.next = holder;        //Node mới vừa tạo chỉ đến vị trí holder;
        numNode++;  // tăng số lượng phần tử lên 1;
    }
    // lấy ra 1 phần tử tại vị trí index;
    public Node get(int index){
        Node temp = head;
        for (int i =0; i<index-1;i++){              // cho con trỏ chạy đến vị trí index -1
            temp = temp.next;                       // con trỏ tại index -1 chỉ tới team tại vị trí index
        }
        return temp;                        // trả về giá trị index;
    }
    // lấy ra phần tử đầu tiên (head);
    public Node getHead(){
        Node temp = head;
        temp=temp.next;
        return temp;
    }
    //in tất cả các phần tử;
    public void printList(){
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    private class Node {             //khai báo class Node
        private Node next;              // thuộc tính Node tên là next
        private Object data;            // thuộc tính data chứa dữ liệu Node

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {
    }


}
