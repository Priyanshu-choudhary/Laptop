class subArraySum{
    public static void main(String args[]){
        int [] arr={1,2,3};
        int p=arr[0], target=5, sum=0,counter=0;
       try{
        for(int i=0;i<arr.length;i++){
        
            sum+=arr[i];
        
            // System.out.println("arr"+arr[i]+"   sum"+sum+  "    p"+p+   "c"+counter);
            if (sum==target) {
                counter++;
                p=arr[i+1];
                sum=0;
            
                // System.out.println("counter+");

        
            }
            else if(sum>target){
                sum-=p;
               
                if (sum==target) {counter++;sum=0;}
            // System.out.println("else "+sum+" "+p);
            p=arr[i+1];   
        }
        }
    }catch(Exception e){}         
               System.out.println(counter);
    }
}