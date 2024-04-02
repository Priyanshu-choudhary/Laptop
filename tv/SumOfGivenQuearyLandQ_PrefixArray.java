import java.util.*;

/**
 * SumOfGivenQuearyLandQ_PrefixArray
 */
public class SumOfGivenQuearyLandQ_PrefixArray {

    public static void main(String[] args) {
        int arr[]={5,4,8,9,3,1};
        Scanner in =new Scanner(System.in);
        int l=in.nextInt();
        int q=in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            try{arr[i]=arr[i-1]+arr[i];
            }catch(Exception e){}
        }
        try {
            System.out.println(arr[q]-arr[l-1]);
        } catch (Exception e) {        }
    }
}