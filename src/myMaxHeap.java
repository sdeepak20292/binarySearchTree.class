

class myMaxHeap {
    public int[] heap;
    public int size;
    public int maxSize;

    public myMaxHeap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize + 1];  // creating extra space for 1st default element.
        heap[0] = Integer.MAX_VALUE;
    }

    public int parentIndex(int pos){
        return pos/2;
    }

    public int leftChildIndex(int pos){
        return pos*2;
    }

    public int rightChildIndex(int pos){
        return pos*2 + 1;
    }

    public boolean isLeaf(int pos){
        return pos > size / 2 && pos <= size;
    }

    public void insert(int element){  // method to insert values in a heap.
        size += 1;
        heap[size] = element;
        int current = size;

        while (heap[current] > heap[parentIndex(current)]){
            int temp = heap[parentIndex(current)];
            heap[parentIndex(current)] = heap[current];
            heap[current] = temp;
            current = parentIndex(current);
        }

    }



    public void maxHeapify(int pos){  // we use it when we have to delete an element.
        if(isLeaf(pos)){
            return;
        }

        if(heap[pos] < heap[leftChildIndex(pos)] || heap[pos] < heap[rightChildIndex(pos)]){
            if(heap[leftChildIndex(pos)] < heap[rightChildIndex(pos)]){
                int temp = heap[rightChildIndex(pos)];
                heap[rightChildIndex(pos)] = heap[pos];
                heap[pos] = temp;
                maxHeapify(rightChildIndex(pos));
            }
            else{
                int temp = heap[leftChildIndex(pos)];
                heap[leftChildIndex(pos)] = heap[pos];
                heap[pos] = temp;
                maxHeapify(leftChildIndex(pos));
            }
        }
    }

    public int extractMax(){  // will return and delete the max element in the heap.....
        int max = heap[1];  // the root node;
        heap[1] = heap[size];
        size -= 1;
        maxHeapify(1);
        return max;
    }









    public void Heapsort(int[] arr)
    {
        int l = arr.length;

        // Build heap (rearrange array)
        for (int i = l / 2 - 1; i >= 0; i--)
            heapify(arr, l, i);

        // One by one extract an element from heap
        for (int i = l - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    public void heapify(int[] arr, int n, int i)
    {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }





}
