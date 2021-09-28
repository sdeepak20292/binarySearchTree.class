import java.util.ArrayList;

public class arrayLists {

    public static void main (String[] args) {
        ArrayList<String> groceryList = new ArrayList<String>(); // declaring an private field object of ArrayList.
        // difference between array and arrayList is that array is declared and it cannot be changed, while arrayList
        // is flexible and can be changed in manny ways. so arrayList is better than aarray.


        addItems(groceryList, "apple");
        addItems(groceryList, "banana");
        addItems(groceryList, "kiwi");
        printGroceryList(groceryList);
        addItems(groceryList, "strawberry");
        addItems(groceryList, "corn");
        modifyItems(groceryList, 0, "orange");
        printGroceryList(groceryList);
        removeItems(groceryList, 4);
        printGroceryList(groceryList);

        findItem(groceryList, "strawberry");
        System.out.println(groceryList);
        System.out.println(groceryList.indexOf("deepak"));  // will return -1;
        System.out.println();
//        System.out.println(groceryList);
        // if item not presetn then indexOf() method return -1.


    }

    public static ArrayList<String> addItems(ArrayList<String> array, String item) {
        array.add(item);
        return array;
    }

    public static void printGroceryList(ArrayList<String> array) {
        System.out.println("You have "+array.size()+" items.");
        for(int i = 0; i < array.size(); i+=1) {
            System.out.println(i+1+". "+array.get(i));
        }

    }

    public static ArrayList<String> removeItems(ArrayList<String> array, int index) {
        array.remove(index);
        return array;
    }

    public static ArrayList<String> modifyItems(ArrayList<String> array, int index, String item) {
        array.set(index, item);
        return array;
    }

    public static void findItem(ArrayList<String> array, String item) { // method to find a particular item in list.
        boolean isThere = array.contains(item);
        int position = array.indexOf(item) + 1;
        if (isThere) {
            System.out.println(item+" at position "+position);
        }
        else{
            System.out.println(item+" not present in the list");
        }
    }



}
