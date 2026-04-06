import java.util.*;
public class basic_sorts{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void bubble_sort(int arr[]){ 
        int n=arr.length;
        for(int turn=0;turn<n-1;turn++){  //n=6  0 1 2 3 4 
            for(int j=0;j<n-1-turn;j++){  //
                if(arr[j]>arr[j+1]){ //for descending use " < "
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String [] args){
        int arr[]={67,5,45,9,34,2};
        bubble_sort(arr);
        printArray(arr);

        Arrays.sort(arr);
        printArray(arr);
        Arrays.sort(arr,starting_index,ending_index);
        Arrays.sort(arr,Collections.reverseOrder());
        printArray(arr);
    }
}
