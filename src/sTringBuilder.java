public class sTringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("deepak");
        System.out.println(str.length());
        System.out.println(str+" "+str.length());
        StringBuilder newstr = str.reverse();
        System.out.println(newstr);

    }
}
