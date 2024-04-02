import java.util.*;
class prefixArray {

    public static void main(String[] args) {
        int arr[]={5,4,4,9,3,1};
        int sum=0,currentSum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            currentSum+=arr[i];
            int temp=sum-currentSum;
            // System.out.println("cs"+currentSum+" s"+sum+" cs-s"+temp+" =arr"+arr[i]);
            if(temp==currentSum){
                System.out.println("0-"+i+"-"+(arr.length-1));
            }
        }

    
       // System.out.println(Arrays.toString(arr));
    }
}