package tcs_question;

public class smallest_arrno {
    public static void main(String args[]){
        int arr[]={22,55,8,5,3,7,1,2};
        int smallest=arr[0];
        int largest=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<smallest ){
                smallest=arr[i];
            }
            else if (arr[i]>largest) {
                largest = arr[i];
            }
                
            
        }
        System.out.println("Smallest number in the array is: "+smallest);
        System.out.println("Largest number in the array is: "+largest);
    }
}
