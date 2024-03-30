class PascalTriangle {
public static long factroial(int n){
    long sum =1;
    for (int i = 1; i <= n; i++) {
    sum*=i;       
    }
    return sum;
}
public static long ncr(int raw,int collum){
    return (factroial(raw)/(factroial(raw-collum)*factroial(collum)));
    }
public static void rawPrint(int raw){
    raw-=1;
    for (int i=0;i<=raw;i++){
        System.out.print(ncr(raw, i)+" ");
        }   
        System.out.println();      
}
public static void pascalTrianglePrint(int size){
    
    for (int index = 1; index <= size; index++) {
        for (int i = 0; i < size- index; i++) {       
                       System.out.print(" ");
            }  
             rawPrint(index);
        }
}
    public static void main(String[] args) {
        int size=15;
        System.out.println(""(13));
         pascalTrianglePrint(size);
        //rawPrint(14);
        }
    
}