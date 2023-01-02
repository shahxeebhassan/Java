import java.util.ArrayList;

/**
 * arrlist
 */
public class arrlist {

    public static void main(String[] args) {
        // syntax 
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.contains(64)); //search
        list.set(0, 8888); //update
        // list.remove(0); //remove
        System.out.println(list);

        for (int i = 0; i < 100; i++) {
            System.out.print(list.get(i));
        }
    }
}