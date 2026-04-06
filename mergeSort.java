public class divide_conquer{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
        System.out.println();
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1]; //5-0+1=6
        int i=si; //left part iterator
        int j=mid+1; //right part iterator
        int k=0; //temp arr iterator
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //remained part of left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //remained part of right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp array to original array
        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid); //left part
        mergeSort(arr,mid+1,ei); //right part
        merge(arr,si,mid,ei);
    }

    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2,3};
        printArr(arr);
        mergeSort(arr,0,arr.length-1);

    }
}
