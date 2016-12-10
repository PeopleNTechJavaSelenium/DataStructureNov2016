package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PIIT_NYA on 12/10/2016.
 */
public class UseArrayList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("NY");
        list.add("FL");
        list.add("AZ");

        System.out.println("Using for loop");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Using for each loop");
        for(String state:list){
            System.out.println(state);
        }
        System.out.println("Using Iterator");
        Iterator it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
