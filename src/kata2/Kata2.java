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



















        /**
        Metodo 1
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("La clave es: " + entry.getKey() + " y el valor es: " + entry.getValue());
        }
        
        //Metodo 2
        for (Integer integer : hashMap.keySet()) {
            System.out.println("Hay una clave: " + integer);
        }
        
        for (Integer value : hashMap.values()) {
            System.out.println("Hay un valor: " + value);
        }
        
        //Metodo 3.A
        Iterator<Map.Entry<Integer,Integer>> entries = hashMap.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("La clave es: " + entry.getKey() + " y el valor es: " + entry.getValue());
        }
        
        //Metodo 3.B
        Iterator entries2 = hashMap.entrySet().iterator();
        while(entries2.hasNext()){
            Map.Entry entry = (Map.Entry) entries2.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println("La clave es: " + entry.getKey() + " y el valor es: " + entry.getValue());
        }
        
        //Metodo 4 (La peor forma)
        for (Integer key : hashMap.keySet()) {
            Integer value = hashMap.get(key);
            System.out.println("La clave es: " + key + " y el valor es: " + value);
            
        }
        **/
        
    }
    
}
