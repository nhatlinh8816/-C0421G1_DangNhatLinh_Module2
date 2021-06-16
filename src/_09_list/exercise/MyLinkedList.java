package _09_list.exercise;

public class MyLinkedList<E> {
    //thuộc tính:
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

    public MyLinkedList() {
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

    //thêm phần tử tại vị trí đầu tiên
    public void addFirst(E firstElement){
        Node temp = head;           //khai báo biến temp tham chiếu đến vị trí của head;
        head = new Node(firstElement);         //head nhận giá trị là node mới;
        head.next = temp;           //head trỏ đến biến temp ban đầu (giờ là node cũ);
        numNode++;          // tăng số lượng Node lên 1;
    }
     //thêm phần tử tại vị trí cuối cùng
    public void addLast(E lastElement){
        Node temp = head;
    }

    // lấy ra 1 phần tử tại vị trí index;
    public Node get(int index){
        Node temp = head;
        for (int i =0; i<index-1;i++){              // cho con trỏ chạy đến vị trí index -1
            temp = temp.next;                       // con trỏ tại index -1 chỉ tới team tại vị trí index
        }
        return temp;                        // trả về giá trị index;
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
    //Phương thức kiểm tra 1 phần tử có trong LinkedList hay không:
    public boolean contain(E element){
        Node temp = head;
        while (temp.next!=null){
            if (temp.data.equals(element)){    // dữ liệu temp hiện tại đem so sánh với phần tử muốn tìm kiếm
                return true;
            }temp = temp.next;
        }if(temp.data.equals(element)){         // so sánh đến vị trí cuối cùng
            return true;
        }
        return false;
    }
    //phương thức xóa 1 phần tử khỏi LinkedList theo vị trí
    public E remove(int index){
        if (index<0||index>numNode){
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        Object data;
        if (index==0){                  //index = 0 tức là phần tử bị xóa đang là head, sau khi xóa head mới là head kế tiếp
            data=temp.data;
            head=head.next;
        }else {                 //index>0, phần tử thuộc vị trí từ i=0 đến index-1 không bị thay đổi
            for (int i =0; i<index-1&&temp.next!=null;i++){
                temp = temp.next;
            }
            data = temp.next.data;   //data rỏ đến node index;
            temp.next = temp.next.next; //node index trỏ đến index+2;
        }
        numNode--;
        return (E) data;
    }
    //xóa 1 phần tử bất kỳ
    public boolean remove(E deleteElement){
        if (head.data.equals(deleteElement)){
            remove(0);
            return true;
        }else {
            Node temp = head;
            while (temp.next==null){
                if (temp.next.data.equals(deleteElement)){
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                }

            } return false;
        }
    }
    public MyLinkedList<E> clone(){
        if (numNode==0){
            throw new NullPointerException();
        }
        //khai báo danh sách trả về
        MyLinkedList<E>temp = new MyLinkedList<E>();
        //khai báo node trỏ đến head;
        Node tempNode = head;
        //add head vào danh sách trả về
        temp.addFirst((E) tempNode.data);
        //trỏ đến node kế tiếp
        tempNode = tempNode.next;
        //add tất cả node kế toán vào danh sách
        while (tempNode!=null){
            temp.addLast((E)tempNode.data);
            tempNode = tempNode.next;
        }
        return temp;
    }
}

