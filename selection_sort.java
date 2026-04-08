import java.util.*;
public class basic_sorts{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void selection_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minPos]){  //for descending use " > "
                    minPos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        }
    }
    public static void main(String [] args){
        int arr[]={67,5,45,9,34,2};
        selection_sort(arr);
        printArray(arr);
    }
}
