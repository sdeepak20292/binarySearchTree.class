public class DoubleLinkedList {
    DllNode head;

    public void insert(int data){
        DllNode n = new DllNode();
        n.data = data;
        n.next = null;
        if(head == null){
            head = n;
            head.previous = null;
        }

        else{
            DllNode d = new DllNode();
            d = head;
            while(d.next != null){
                d = d.next;
            }
            d.next = n;
            n.previous = d;
        }

    }

    public void insertAt(int index, int data){
        DllNode n = new DllNode();
        n.data = data;
        DllNode d = new DllNode();
        d = head;
        for(int i = 0; i < index - 1; i++){
            d = d.next;
        }
        n.next = d.next;
        d.next = n;
        n.previous = d;


    }

    public void delete(int index){
        DllNode d = new DllNode(); // node to be deleted.
        DllNode t = new DllNode();
        t = head;
        for(int i = 0; i < index - 1; i++){
            t = t.next;
        }

        d = t.next;
        if(d.next == null){
            t.next = null;
        }
        else{
            t.next = d.next;
            d = d.next;
            d.previous = t;
        }

    }

    public void show(){
        DllNode d = new DllNode();
        d = head;
        while(d.next != null){
            System.out.println(d.data);
            d = d.next;
        }
        System.out.println(d.data);
    }

    public static void main(String[] args) {
        DoubleLinkedList arr = new DoubleLinkedList();
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(3);
        arr.insert(99);
        arr.insert(900);
        arr.insertAt(2, 33);
        arr.insertAt(5, 50);
        arr.delete(2);
        arr.delete(5);
        arr.delete(5);

        arr.show();
    }
}
