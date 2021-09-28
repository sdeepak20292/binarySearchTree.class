public class myQueue {
    public Node rear;
    public Node front;
    public int size;

    public void enqueue(int data){
        // will add at the last;
        Node newNode = new Node();
        newNode.data = data;
        if(front == null){
            rear = newNode;
            front = newNode;
            size++;

        }
        else{
            rear.next = newNode;
            rear = newNode;
            size++;
        }

    }

    public void dequeue(){
        if(front == null){
            System.out.println("empty queue");
            return;
        }
        Node newNode = new Node();
        newNode = front.next;
        front = newNode;
        size--;
    }

    public boolean empty(){
        return front == null;
    }




    public void increment(int k, int increment){  // will increase
        int j = size ;
        for(int i =0; i < size; i ++){
            if(j > k){
                int p = front.data;
                dequeue();
                enqueue(p);
                j--;

            }
            else{
                int p = front.data + increment;
                dequeue();
                enqueue(p);
            }

        }
    }


    public void show(){
        Node n = front;
        while(n != rear){
            System.out.println(n.data);
            n = n.next;
        }

        System.out.println(n.data);
    }

    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.show();
        q.increment(3, 9);
        System.out.println();
        q.show();
        System.out.println();
        q.dequeue();
        q.show();


    }


    }



