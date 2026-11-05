package tcs_question;

public class misssingno {
    public static void main(String args[]){
        int arr[]={1,2,4,5,6};
        
        int n=6;
        int sum = n*(n+1)/2;

        for (int i=0;i<arr.length;i++){
sum-=arr[i];
        }
        System.out.println(sum);
    }

}
