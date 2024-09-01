import java.util.Scanner;

public class SearchingAlgorithm {


    public void linearSearch(int[] arr , int num){
        boolean flag =false ;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==num){
                System.out.println("Element Found At "+ i + " index");
               flag = true;
               break ;
            }
            
        }
        if(flag!=true){
            System.out.println("NO Element find ");
        }


    }
       

     

    public void binarySearch(int[] arr , int num){
        int low = 0 ;
        int high = arr.length-1;
        

       while(low<=high){

        int mid = (low + high)/2 ;

        if(arr[mid]==num){
           System.out.println("Element found At " + mid + " index " ) ;
           return  ; 
        }
        else if(arr[mid]<num){
            low =mid+1 ;
        }
        else if (arr[mid]>num ){
            high = mid-1; 
        }
        

       }

      System.out.println("No Element find : ");
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchingAlgorithm s = new SearchingAlgorithm();

        int[] arr = new int[5];

        System.out.println("Enter 5 integers separated by spaces:");
        // Read integers from the user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element to  find : ");
        int target = sc.nextInt();
        
        sc.close();

        s.binarySearch(arr,target );
        s.linearSearch(arr,target );



    }

}
