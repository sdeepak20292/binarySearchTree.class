import java.util.Stack;

public class Assignment2 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        char[] ch = new char[6];
        ch = new char[]{'c', 'd', 'a', 'b', 'e', 'f', 'g'};
        System.out.println(seatingArrangement(ch, 2));

    }

    static String seatingArrangement(char[] arr, int K) {


        int N = arr.length;

        int maxLength = N - K;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (stack.isEmpty()) {
                stack.add(arr[i]);
            } else {

                while ((!stack.isEmpty()) && (arr[i] < stack.peek()) && (stack.size() + N - (i + 1) >= maxLength)) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.size() < maxLength) {
                    stack.add(arr[i]);
                }
            }
        }

        String answer = "";

        while (!stack.isEmpty()) {
            answer += (stack.peek());
            stack.pop();
        }

        return reverse(answer);


    }

    public static String reverse(String word) {  // function to reverse a string.
        String reverseWord = "";
        for (int i = 0; i < word.length(); i++) {
            reverseWord += word.charAt(word.length() - i - 1);
        }
        return reverseWord;
    }
}
