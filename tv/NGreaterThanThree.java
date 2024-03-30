import java.util.HashMap;
import java.util.Map;

class NGreaterThanThree {
public static void main(String[] args) {
 HashMap<Integer,Integer> map=new HashMap<>();
 int[] arr={1,2,2,3,2,1,1,2,1,3,1,1,2,2,1,2,1,2,2,1,2,2,3,2,2,1,1,1,2,1,2,2,1,1,2,3,4,3,4,4,4,5,3,2,3,4,4};   

 System.out.println("Method 1"); 
 for(int value:arr){
        map.put(value,map.getOrDefault(value, 0)+1);
        if(map.get(value)>arr.length/3){
            System.out.println(map.get(value));
            break;
        }    
    }

    System.out.println("Method 2");
    for (Map.Entry<Integer,Integer>entry:map.entrySet()) {
        //entry.getKey()= number
        //entry.getValue()= frequency
        if(entry.getValue()>arr.length/3){
            System.out.println(entry.getKey()+" OF "+entry.getValue());
        }   
    }
}
}