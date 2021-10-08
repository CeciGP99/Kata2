package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] data = {1,2,1,40,9,17,17,89,89,100,11,4,13,20,89};
        
        HashMap<Integer, Integer> histogram = new HashMap <Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }

    }
    
}
