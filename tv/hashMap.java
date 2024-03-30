import java.util.HashMap;
import java.util.Map;

class hashMap {
public static void main(String[] args) {
 HashMap<Integer,Integer> map=new HashMap<>();
 int[] arr={1,2,2,3,2,1,1,2,1,3,1,1,2,2,1,2,1,2,2,1,2,2,3,2,2,1,1,1,2,1,2,2,1,1,2,3,4,3,4,4,4,5,3,2,3,4,4};   
    for(int value:arr){
        map.put(value,map.getOrDefault(value, 0)+1);
    }
    for (Map.Entry<Integer,Integer>entry:map.entrySet()) {
        //entry.getKey()= number
        //entry.getValue()= frequency

        
        System.out.println(entry.getValue()+" "+entry.getKey());        
    }
}
}