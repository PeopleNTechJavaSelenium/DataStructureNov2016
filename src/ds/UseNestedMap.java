package ds;

import java.util.*;

/**
 * Created by PIIT_NYA on 12/10/2016.
 */
public class UseNestedMap {

    public static void main(String[] args) {

        List<String> citiesOfUSA = new ArrayList<String>();
        citiesOfUSA.add("NY");
        citiesOfUSA.add("CA");

        List<String> citiesOfCanada = new ArrayList<String>();
        citiesOfCanada.add("Toronto");
        citiesOfCanada.add("Montreal");

        List<String> citiesOfUK = new ArrayList<String>();
        citiesOfUK.add("London");
        citiesOfUK.add("Manchestar");

        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        map.put("USA", citiesOfUSA);
        map.put("Canada", citiesOfCanada);
        map.put("UK", citiesOfUK);

        for(Map.Entry city:map.entrySet()){
            System.out.println(city.getKey()+ "  " +   city.getValue());
        }
    }
}
