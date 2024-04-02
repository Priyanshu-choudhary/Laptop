import java.util.*;
class prefixArray {

    public static void main(String[] args) {
        int arr[]={5,4,8,9,3,1};
        for (int i = 0; i < arr.length; i++) {
            try{arr[i]=arr[i-1]+arr[i];
            }catch(Exception e){}
        }
        System.out.println(Arrays.toString(arr));
    }
}