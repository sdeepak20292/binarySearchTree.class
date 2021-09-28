import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class maze {


    public static int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < students.length - 1; i++) {
            q.add(students[i]);
            stack.push(sandwiches[sandwiches.length - 1 - i]);
        }

        int r = 0;  // for counting rotation.
        int p = 0;
        while (!q.isEmpty() && r < q.size()) {

            if (stack.peek() == q.peek()) {
                stack.pop();
                q.remove();
                r = 0;
            }
            else {
                r++;
                q.add(q.remove());  // enque and deque//
                 // counting rotations
            }
        }

        return q.size();
    }

    public static void main(String[] args) {
        int[] std = {0, 0, 0, 1, 1, 1, 1, 0, 0, 0};
        int[] snd = {1, 0, 1, 0, 0, 1, 1, 0, 0, 0};
        System.out.println(countStudents(std, snd));
    }
}




