package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by PIIT_NYA on 12/10/2016.
 */
public class UseQueue {
    public static void main(String[] args) {
        Queue<String> list = new LinkedList<>();
        list.add("Lohan");
        list.add("Michael");
        list.add("Elezabeth");

        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(list.element());
            list.remove();
        }
    }


}
