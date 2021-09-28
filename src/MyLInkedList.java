public class MyLInkedList {
    Node head;  // this is the head node, initially it is null.
    int size;
    // will create some methdods
    public void insert(int data){
        Node node = new Node(); // in order to insert, we will create a new node.
        node.data = data;
        node.next = null; // will assign the next node reference as null.

        if(head == null){
            // will check if this is the first element.
            head = node;

        }

        else{
            // if head is not null.
            Node n = new Node();
            n = head; // we will treansverse throguh the linked list.
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
        size++;

    }

    public void show(){
        Node n = new Node();
        n = head;
        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void insertAtfirst(int data){ // we just have to make this node as head and it's next as head.
        Node node = new Node();
        node.data = data;
        node.next = head;  // doing this bcos, the old head will be the next node to it.
        head = node;
        size++;

    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        Node n = new Node();
        n = head;
        if(index == 0){  // will insert at first.
            node.next = head;

            head = node;
        }
        else{  // will insert at any random position.
            for(int i = 0; i< index - 1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
        size++;

    }

    public void delete(int index){
        Node n = new Node();
        Node d = new Node();
        n = head;
        if(index == 0){
            n = head.next;
            head = n;
        }
        else{
            for(int i = 0; i< index - 1; i++){
                n = n.next;
            }
            d = n.next;
            n.next = d.next;
        }
        size--;
    }

    public void reverLinkedList(){
        // we will create 3 pointers.
        Node current = head;
        Node next = null;
        Node previous = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void addInmiddle(int data){
        Node n = new Node();
        n.data = data;
        Node node = new Node();
        node = head;
        int i = 0;
        int till = 0;
        if(size % 2 == 0){
            till = size/2;
        }
        else{
            till = size/2 + 1;
        }
        while(i != till - 1){
            node = node.next;
            i++;
        }
        Node temp = node.next;
        n.next = temp;
        node.next = n;

    }

    public int returnMiddle(){
        int till = 0;
        if(size % 2 == 0){
            till = size/2;
        }
        else{
            till = size/2 + 1;
        }
        Node node = new Node();
        node = head;
        int i = 0;
        while(i != till){
            node = node.next;
            i++;
        }
        return node.data;
    }

    public static void main(String[] args) {
        MyLInkedList list = new MyLInkedList();
        list.insert(0);
        list.insert(2);
        list.insert(99);
        list.insert(89);
        list.show();
        System.out.println();
        list.reverLinkedList();  // this method will reverse the linked list.

        list.show();

//        list.addInmiddle(5);
//        System.out.println(list.returnMiddle());
//
//        list.show();
//        list.insert(78);
//        System.out.println();
//        list.show();
//        list.addInmiddle(55);
//        System.out.println();
//        list.show();
//        System.out.println();
//        System.out.println(list.returnMiddle());



    }


}
