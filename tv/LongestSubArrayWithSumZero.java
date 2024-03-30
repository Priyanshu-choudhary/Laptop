/**
 * LongestSubArrayWithSumZero
 */
public class LongestSubArrayWithSumZero {

    public static void main(String[] args) {
        int arr[]={9,-3,3,-1,1,6,-5};
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]+arr[i+1]==0){
                cnt++;
            }
        }
    }
}