import java.util.ArrayList;
import java.util.Scanner;

public class StepsCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if((i>=0)&&(i<=45)){
            System.out.println(Fibonacci(i ));
        }

    }

    public static int Fibonacci(int N)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int num1 = 0, num2 = 1;

        int count = 0;

        while (count < N+2) {

            int num3 = num2 + num1;
            arr.add(num1);
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }
        return arr.get(N+1);
    }
}
