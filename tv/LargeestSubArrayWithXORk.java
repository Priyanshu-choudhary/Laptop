import java.util.*;
class LargeestSubArrayWithXORk {
static int xor(int i,int j, int[] arr){
    int result=0;
    for (int index = i; index <= j; index++) {
        result=result^arr[index];
    }
    return result;
}
    public static void main(String[] args) {
        int [] arr={4,2,2,6,4};
        int result=0,target=6;
        for (int i = 0; i < arr.length; i++) {
            for (int index = 0; index < arr.length; index++) {
               if (target==xor(i,index,arr)) {
                for (int j = i; j <=index; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }         
            }
        }
        
    }
}