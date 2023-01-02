import java.util.Scanner;
import java.util.ArrayList;

public class arrlistofArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //adding 3 arraylists in list
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
