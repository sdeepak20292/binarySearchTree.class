public class whileLoops {
    public static void main (String[] args) {
        // while loops.
        int count = 0;
        while (count<=6) {
            System.out.println(count);
            count += 1;
        }

        // do while.
        count = 0;
        do {
            System.out.println(count);
            count += 1;
            if (count == 10) {
                break;
            }
        } while (count <= 50);

        // while true.

        count = 0;
        while (true) {
            System.out.println(count);
            count += 1;
            if (count == 6) {
                break;

            }
        }
    }
}
