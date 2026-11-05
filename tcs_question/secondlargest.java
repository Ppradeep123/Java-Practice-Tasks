package tcs_question;

public class secondlargest {
    public static void main(String args[]){
        int arr[]={222,55,8,5,3,7,1,2};
        
    int largest=arr[0];
    int secondlargest=0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondlargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]!=largest){
            secondlargest=arr[i];
        }
    }
    System.out.println("Second largest number in the array is: "+secondlargest);
    }
}
