import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
    public static void main(String[] args) {
        // making an linked list of Strings
        LinkedList<String> placeToVisit = new LinkedList<>();
//        placeToVisit.add("Marine Drive");
//        placeToVisit.add("Alibaug");
//        placeToVisit.add("Imagica");
//        placeToVisit.add("Gateway Of India");
//        Iterator<String> i = placeToVisit.iterator();
//        // this is equivalent of a foor loop to iterate contenets of the linked list.
//
//        while(i.hasNext()){ // cheking whether there is next element in the linkedlist
//            System.out.println("Should visit "+i.next()); // printing the current element.
//        }
//        System.out.println();
//
//        //adding elements in the list.
//        placeToVisit.add(1, "Navy Nagar");
//        for(int j = 0; j < placeToVisit.size(); j ++){
//            System.out.println(placeToVisit.get(j));
//        }
//
//        placeToVisit.remove("Alibaug");
//        System.out.println();
//        for(int d = 0; d < placeToVisit.size(); d ++){
//            System.out.println(placeToVisit.get(d));
//        }
//
//        placeToVisit.set(1, "Defence Area - probhited");
//        System.out.println();
//        for(int k = 0; k < placeToVisit.size(); k ++){
//            System.out.println(placeToVisit.get(k));
//        }
//        System.out.println();
//        addInOrder(placeToVisit, "Lonavala");
//        printLinkList(placeToVisit);
//        System.out.println();
//        addInOrder(placeToVisit, "klibaug");
//        printLinkList(placeToVisit);
//        addInOrder(placeToVisit,"Melbourne" );
//        printLinkList(placeToVisit);
////        addInOrder(placeToVisit, "br");
////        addInOrder(placeToVisit, "cd");
////        addInOrder(placeToVisit, "df");
////        addInOrder(placeToVisit, "ew");
////        addInOrder(placeToVisit, "fs");
//        addInOrder(placeToVisit, "nathan james");
//        printLinkList(placeToVisit);
        addInOrder(placeToVisit, "Marine Drive");
        addInOrder(placeToVisit, "Gateway of India");
        addInOrder(placeToVisit, "Charni Road");

        addInOrder(placeToVisit, "Elephanta Caves");
        printLinkList(placeToVisit);
    }

    public static void addInOrder(LinkedList<String> linkList, String destination){
        ListIterator<String> i = linkList.listIterator();
        while(i.hasNext()){
            String t = i.next();
            int comparision = t.compareTo(destination);

            if(comparision > 0){

                // we have to go to previous entry.
                i.previous();
                i.add(destination);
            }
            else{
                i.add(destination);
            }

        }

    }

    public static void printLinkList(LinkedList<String> linklist){
        Iterator<String> i = linklist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
