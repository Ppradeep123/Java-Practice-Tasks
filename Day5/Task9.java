package Day5;

public class Task9 {
    static void findodd(int arr[]){
int oddcount=0;
        int evencount=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2!=0){
                oddcount+=1;
            }
            else{
                evencount+=1;
            }
        }
        System.out.println("count of odd number is"+ oddcount);
        System.out.println("count of even number is"+ evencount);
    }
    public static void main(String args []){
        int series[]={54,411,11,21,31,56,89,85,45,6};
        findodd(series);
    }
}
