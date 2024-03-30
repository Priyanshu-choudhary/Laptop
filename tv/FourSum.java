import java.util.*;

class FourSum {
public static void main(String[] args) {
    int arr[]={-1,-2,2,1,3,5,7};
    Arrays.sort(arr);

    int target=0;
for (int j2 = 0; j2 < arr.length; j2++) {
    for (int i = 1; i < arr.length; i++) {
        int k=arr.length-1;
        int j=2;
        for (int l = 2; l < arr.length; l++) {
         int sum=arr[j]+arr[k]+arr[i]+arr[j2];
         if (sum==target) {
            System.out.println(arr[j2]+" "+arr[i]+" "+arr[j]+" "+arr[k]);
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
    
}