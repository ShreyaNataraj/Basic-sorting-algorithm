import java.util.Arrays;

public class Inbuiltsort {
    public static void printarr(Integer arr[]){
        for(Integer i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
      // Use print instead of println
      Integer arr[] ={5,2,3,6,1};
      Arrays.sort(arr);
      printarr(arr);
        
       
}
}