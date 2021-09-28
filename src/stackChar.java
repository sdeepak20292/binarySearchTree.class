public class stackChar {
    public Node top;
    char size;

    public void push(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(top == null){
            top = newNode;
        }

        else{
            newNode.next = top;
            top = newNode;
            size ++;
        }

    }

    public boolean isEmpty(){
        return size <= 0;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Overflow");

        }
        else{
            int n = top.data;
            top = top.next;
            size--;       // this next is basically the below node in the stack, we are deleting the top.
            return n;

        }
        return -1;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }

    public void show(){
        Node node = new Node();
        node = top;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
