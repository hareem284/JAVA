
//used a little bit of help
import java.util.*;

public class Main {

    public static ArrayList<String> swapFirstLast(ArrayList<String> list) {

        // Store the first element
        String first = list.get(0);

        // Get the index of the last element
        int lastIndex = list.size() - 1;

        // Put the last element in the first position
        list.set(0, list.get(lastIndex));

        // Put the first element in the last position
        list.set(lastIndex, first);

        return list;

        ArrayList<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");

        System.out.println(swapFirstLast(list));
    }
}