public class MergeSort {


    public static void mergeSort(int[] arr , int si , int ei ){
        if(si>=ei){
            return;
        }
        int mid =  si + (ei - si) / 2;
         //dividing left part 
        mergeSort(arr, si ,mid);
        //dividing right part 
        mergeSort(arr,mid+1,ei);
        //  merge all divided parts 
        merge(arr,mid,si,ei);

        

        
    }

    public static void  merge(int []arr , int mid , int si , int ei){
      int [] temp  = new int [ei-si+1];
       int i = si ;
       int j = mid+1 ; 
       int k = 0 ;
         
       // compare and merge both array 
         while(i<=mid && j<= ei){
            // if left is less then insert in temp array 
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
        }

        // otherwie insert in temp if right is less
        else{
          temp[k]=arr[j];
          j++;
        }
         k++ ;
        }

        // two while llops for remianing element of both side to be add in array 

           // for left side 
            while(i<=mid){
              temp[k++]=arr[i++];
            }
            // for right side arrray to mege 
            while(j<=ei){
              temp[k++]=arr[j++];
            }



       
                //copy temp array to original array 
                for (i = si; i <= ei; i++) {
                  arr[i] = temp[i - si];
                }

    }



    public static void main(String [] args){

        int arr[] = {1 ,30 , 20 ,60,30,10,5,100,25,110,35,70} ;

        mergeSort(arr , 0 , arr.length-1);

          //print the sorted array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
