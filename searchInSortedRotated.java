public class divide_conquer{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
        System.out.println();
    }
    public static int searchInSortedRotated(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        //target on l1   
        if(arr[si]<=arr[mid]){
            //left part of l1
            if(arr[si]<=tar && tar<=arr[mid]){
                return searchInSortedRotated(arr,tar,si,mid-1);
            }//right part of l1
            else{
                return searchInSortedRotated(arr,tar,mid+1,ei);
            }
        }//mid on l2
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return searchInSortedRotated(arr,tar,mid+1,ei);
            }else{
                return searchInSortedRotated(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int tar=0;
        System.out.println(searchInSortedRotated(arr,tar,0,arr.length-1));
        printArr(arr);
    }
}
