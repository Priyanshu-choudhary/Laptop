import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;
class matrix{
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int l=0,t=0;

               for (int i = 0; i < 3; i++) {
                                   System.out.println("\n1------"); 
                                 
                 for (int j= 0; j+t <arr.length; j++) {//1
                                    System.out.print(arr[l][j+l]+",");
                                }
                                t++;
                                System.out.println("\n2-------");
                      if(t>=arr.length){System.out.println("exit");break;}          
               for (int j = 0; j+t <arr.length; j++) {//2
                                    System.out.print(arr[j+t-l][arr.length-l-1]+",");
                                }
                                System.out.println("\n3---------");
                for (int j = 0; j+t <arr.length; j++) {//3
                                    System.out.print(arr[arr.length-l-1][arr.length-j-1-t+l]+",");
                                }
                                t++;
                                System.out.println("\n4-----");
                for (int j = 0; j+t <arr.length; j++) {//
                                    System.out.print(arr[arr.length-j-t+l][l]+",");
                                }
                                                            l++;            
                }
                                                         
}
            
}