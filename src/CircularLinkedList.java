public class CircularLinkedList {
    CllNode head;
    CllNode tail;

    public void insert(int data){
        CllNode newNode = new CllNode();
        newNode.data = data;
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void delete(int index){
        CllNode node = new CllNode();
        node = head;
        CllNode d = new CllNode();
        for(int i = 0; i < index - 1; i ++){
            node = node.next;
        }
        d = node.next;
        node.next = d.next;
    }

    public void deleteAtlast(){
        CllNode node = new CllNode();
        node = head;
        while(node.next != tail){
            node = node.next;
        }
        node.next = head;

    }

    public void show(){
        CllNode t = new CllNode();
        t = head;
        while(t.next != head){
            System.out.println(t.data);
            t = t.next;
        }
        System.out.println(t.data);
    }

    public static void main(String[] args) {
        CircularLinkedList arr = new CircularLinkedList();
        arr.insert(1);
        arr.insert(22);
        arr.insert(33);
        arr.insert(44);
        arr.insert(55);
        arr.delete(2);
        arr.show();
        System.out.println("deleting at last");
        arr.deleteAtlast();
        arr.show();
    }
}
