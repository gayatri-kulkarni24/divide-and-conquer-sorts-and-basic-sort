import java.util.*;
public class basic_sorts{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];//1st index value
            int prev=i-1; //0th index
            while (prev>=0 && arr[prev]>curr){ //arr[0] >arr[1]  //for descending use " < "
                arr[prev+1]=arr[prev]; //arr[1]=arr[0]
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String [] args){
        int arr[]={67,5,45,9,34,2};
        insertion_sort(arr);
        printArray(arr);
    }
}
