import java.util.*;

import javax.print.attribute.standard.RequestingUserName;
/**
 * LagesrConSum)
 */
 class LagesrConSum{
  static int  giveValueReturnValue(int value, Map <Integer,Integer> mp){
    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        if(entry.getValue()==value){
            return entry.getKey();
        }
    }
    return 0;
  }
public static void main(String args[]){
        int [] arr={9,3,-3,1,-2,1,5,6,9,-5,-1,2,-3,-2};
        //List<Integer>li= new ArrayList<>();
       Map <Integer,Integer> mp=new HashMap<>();
        int sum=0,count=0,flag=1,now=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            count++;
            
            System.out.print(String.format("%-" + 5+ "d%d", arr[i], sum));
            
            if( mp.containsValue(sum)){
              /*  if(flag==1){
                flag=0;
               }else{
                sum=0;
                flag=1;
            }*/
            now=i- giveValueReturnValue(11, mp);
                System.out.print( "     contain value " +sum+" at"+now);
              
                sum=0;
                
            }
            mp.put(i,sum);
            System.out.println();           
        }
        System.out.println(giveValueReturnValue(11, mp));
            }
    
}