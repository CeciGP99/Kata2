package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] data = {1,2,1,40,9,17,7,89,95,100,11,4,13,20,500};
        
        HashMap<Integer, Integer> histogram = new HashMap <Integer, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }

    }
    
}
