package ds;

import java.util.LinkedList;

/**
 * Created by PIIT_NYA on 12/10/2016.
 */
public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("NY");
        list.add("FL");
        list.add("AZ");

        for(String state:list){
            System.out.println(state);
        }

    }
}
