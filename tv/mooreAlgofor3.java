class moorealgo{
    public static void main(String[] args) {
        int[] arr={2,1,3,1,2,1,2,1,1,3,1};
        int c=0,el=0,c2=0,el2=0;
        for (int i = 0; i < arr.length; i++) {
         
            if(c==0 && el2  != arr[i]){
                el=arr[i];
                c++;
            }
            if(c2==0  && el  != arr[i]){
                    el2=arr[i]; 
                    c2++;
                }
                else if(el==arr[i]){
                    c++;
                }
                else if(el2==arr[i]){
                    c2++;
                }
                else{
                     c--;c2--;
                    }
                    
        }
        System.out.println(el+" "+c+" "+el2+" "+c2);
        //verifing if reallyelement remaining >2
        
    }
}
