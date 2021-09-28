public class myHeap {  // implementation of max Heap.
    int size;
    int[] arr = new int[20];

    public void insertNew(int val){
        arr[size] = val;
        int index = size;
        int parent = (index - 1)/2;

        while(parent >= 0 && arr[parent] < arr[index]){
            int temp = arr[parent];
            arr[parent] = arr[index];
            arr[index] = temp;

            temp = parent;
            index=  parent;
            parent = (temp - 1)/2;

        }
        size ++;

    }

    public int getMax(){  // retur max value(root value).
        return arr[0];
    }

    public int removeMax(){
        // will return and remove max value.

        int max = arr[0]; // this is the max element.
        arr[0] = arr[size];
        // last elemenet will be replaced with the root.

        size = size - 1;
        heapifyMax(0);
        return max;

    }
//    public int extractMax()
//    {
//        int popped = arr[1];
//        arr[1] = arr[size--];
//        heapifyMax(1);
//        return popped;
//    }

    public void heapifyMax(int index){
        // will reshuffle the heap after deletion.
        int l = 2 * index + 1; // left child
        int r = 2 * index + 1; // right child
        int largest = index; // parent.
        if(this.size > 0 && arr[largest] < arr[l]){
            largest = l;
        }
        if(this.size > 0 && arr[largest] < arr[r]){
            largest = r;
        }

        if(largest != index){
            int temp = arr[largest];
            arr[largest] = arr[index];

            arr[index] = temp;

            heapifyMax(largest);  // again down sift....
        }


    }

    public static void main(String[] args) {
//        myHeap h = new myHeap();
//        h.insertNew(1);
//        h.insertNew(2);
//        h.insertNew(-9);
//        h.insertNew(8);
//        System.out.println(h.getMax());
//        System.out.println(h.removeMax());
//        System.out.println(h.getMax());
    }




}
