import java.util.ArrayList;
import java.util.Scanner;

public class NiceStrings {
    public static String niceStrings(String a , int n){
        ArrayList<Character> stringArray = new ArrayList<Character>();
        for(int i = 0; i < n; i ++ ) {
            stringArray.add(a.charAt(i));
        }
        String niceString = "";
        for(int j = 0; j < n; j++ ) {
            if(!niceString.contains(String.valueOf(stringArray.get(j)))){
                niceString+= String.valueOf(stringArray.get(j));

            }
        }
        return niceString;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.nextLine();
        System.out.println(niceStrings(word, n));
    }
}
