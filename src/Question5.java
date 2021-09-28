import java.util.Arrays;
import java.util.Stack;

public class Question5 {

    public static void nearestFriend(int[] arr){
        int[] output = new int[arr.length];
        for(int i = 0; i < arr.length - 1; i ++){
            int j = i + 1;
            boolean flag = false;
            while(j <= arr.length){
                if(arr[j] > arr[i]){
                    output[i] = j;
                    flag = true;

                }
                j++;
            }

            if(!flag){
                output[i] = j;
            }
        }

        System.out.println(Arrays.toString(output));

        for(int j = 0; j < output.length; j++){
            if(output[j] == -1){
                System.out.println("Player at index "+(j+1)+" has no nearest friend");
            }
            else{
                System.out.println("Player at index "+ (j + 1) +" has nearest friend at "+output[j]
                        +", having match" + " " + "value "+arr[j]);

            }
        }
    }


    public static void nearestGreatestElement(int[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        int[] outputArr = new int[arr.length];  // this is the array to store the nearest friends index for a particular index.

        int i = 0;
        while(i < arr.length){
            int element = arr[i];

            if(stack.empty()){
                stack.push(i);
                i++;
                continue;
            }

            if(element <= arr[stack.peek()]){
                stack.push(i);
                i ++;
            }

            if(element > arr[stack.peek()]){
                outputArr[stack.pop()] = i + 1;  // i + 1, bcos of 1 based indexing.
            }
        }

        while(!stack.empty()){  // remaing indexes in stack will have no nearest freinds.
            outputArr[stack.pop()] = -1;

        }
        System.out.println(Arrays.toString(outputArr));

        for(int j = 0; j < outputArr.length; j++){
            if(outputArr[j] == -1){
                System.out.println("Player at index "+(j+1)+" has no nearest friend");
            }
            else{
                System.out.println("Player at index "+ (j + 1) +" has nearest friend at "+outputArr[j]
                        +", having match" + " " + "value "+arr[j]);

            }
        }
    }



    public static void main(String[] args){
        int[] arr = new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7};
        nearestGreatestElement(arr);

    }


}
