import java.util.Scanner;

public class practice {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String reversedS = "";

        for(int i= s.length() - 1; i >=0; i -=1) {
            reversedS += s.charAt(i);
        }
        if(reversedS.equals(s)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }


    }

//
//    public static void isPalindrome(String s) {
//        String reversedS = "";
//        for(int i= s.length() - 1; i >=0; i -=1) {
//            reversedS += s.charAt(i);
//        }
//        if(reversedS.equals(s)){
//            System.out.println("YES");
//        }
//        else {
//            System.out.println("NO");
//        }
//    }
}
