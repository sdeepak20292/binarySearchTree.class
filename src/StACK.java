public class StACK {
    // STACK IMPLEMENTATION.
    // suppose we take stack size as 5 intially.

    int[] stack = new int[5];

    int top = 0;

    public StACK(int n){
        int[] stack = new int[n];
    }

    public void push(int data){

        stack[top] = data;
        top++;
    }

    public void show(){
        for(int n : stack){
            System.out.println(n);

        }
    }

    public int pop(){ // this method will remove the last element from our stack.
        if(top - 1 < 0){
            System.out.println("Stack is empty");
        }

        else{
            int data = stack[top - 1];
            stack[top - 1] = 0;
            top --;
            return data;

        }
        return -1;
    }

    public int peek(){
        // this method wiil return the last element in the stack without deleting it.

        return stack[top - 1];

    }

    public int size(){
        // this method will return the size of stack.
        return top;
    }

    public boolean isEmpty(){
        return (top - 1 < 0);
    }



    public static void main(String[] args) {
        // runner.

        StACK st = new StACK(5);
        st.push(1);
        st.push(9);
        st.push(20);
        st.show();
        System.out.println(st.pop());
        System.out.println();
        st.push(90);
        st.show();
        System.out.println(st.pop());
        System.out.println();
        st.push(23);
        st.push(89);
        st.show();
        System.out.println();
        System.out.println(st.pop());
        System.out.println();
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println();
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.push(67);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        System.out.println();
        st.show();
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.show();

        //ALL METHODS WORKING PROPERLY.


    }


}


