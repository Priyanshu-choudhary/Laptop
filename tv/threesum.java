import java.util.*;

class threesum {
public static void main(String[] args) {
    int arr[]={-1,-2,2,1,3,5,7};
    Arrays.sort(arr);

    int target=0;
    for (int i = 0; i < arr.length; i++) {
        int k=arr.length-1;
        int j=1;
       for (int l = 1; l < arr.length; l++) {
         int sum=arr[j]+arr[k]+arr[i];
         if (sum==target) {
            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
            break;
         }
        else if (sum>target) {
            k--;
         }else{
            j++;
            }  
        }
    }
}
    
}