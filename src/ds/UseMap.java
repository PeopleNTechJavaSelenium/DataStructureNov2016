package ds;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by PIIT_NYA on 12/10/2016.
 */
public class UseMap {
    public static void main(String[] args) {
        Map<String, String> list = new LinkedHashMap<String, String>();
        list.put("USA", "NY");
        list.put("Canada", "Toronto");
        list.put("UK", "London");

        for(Map.Entry map:list.entrySet()){
            System.out.println(map.getKey()+ "  " +   map.getValue());
        }
    }
}
