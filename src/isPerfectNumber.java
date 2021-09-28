public class isPerfectNumber {
    public static void main (String[] args) {
        System.out.println(IsPerfectNumber(28));
        NumberToWords(100);

    }

    public static boolean IsPerfectNumber(int number) {  // method to check a perfect number.
        int sum = 0;
        for (int i = 1; i < number; i += 1) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void NumberToWords(int number) {
        String num = Integer.toString(number);
        int length = num.length();
        int start = 0;

        while(start < length) {
            char w = num.charAt(start);
            switch (w) {
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                case '0':
                    System.out.print("zero ");

            }
            if (start == length - 1) {
                System.out.print("only");
            }
            start += 1;
        }
    }


}
