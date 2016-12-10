package ds;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by PIIT_NYA on 12/10/2016.
 */
public class UseStack {

    public static void main(String[] args) {
        Stack<Object> list = new Stack<Object>();
        list.push("10");
        list.push("20");
        list.push("30");
        System.out.println("Peek Element: " + list.peek());
        Iterator it = list.listIterator();
        while(it.hasNext()) {
            System.out.println(list.pop());
        }
    }
}
