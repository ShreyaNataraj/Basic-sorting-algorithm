public class Bubblesort{
  public static void bubblesort(int arr[]){
    for(int i = 0; i<arr.length; i++){
      for(int j =0; j<arr.length-1-i; j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      } 
      }
    }
  
  public static void printarr(int arr[]){
    for(int i = 0; i<arr.length; i++){
      System.out.println(arr[i] + " ");
    }
  System.out.println();
}

  public static void main(String args[]){
    int arr[] ={5,3,2,1,8};
    bubblesort(arr);
    printarr(arr);
  }
}